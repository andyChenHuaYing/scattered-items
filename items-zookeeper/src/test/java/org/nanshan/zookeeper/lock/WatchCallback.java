package org.nanshan.zookeeper.lock;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class WatchCallback implements Watcher, AsyncCallback.StatCallback, AsyncCallback.StringCallback, AsyncCallback.Children2Callback {
    private ZooKeeper zk;
    private String threadName;

    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    public ZooKeeper getZk() {
        return zk;
    }

    /**
     * 1：只有一个人获取锁
     * 2：释放锁之后要通知别人
     * 3：可以重复获取锁
     * 4：羊群效应：所有待获取锁的对象都监控一个节点
     * 5：所有获取锁的对象按照顺序排队等待
     * 6：每个获取锁失败的对象只监听前面一个对象的节点删除事件
     */
    private CountDownLatch cc = new CountDownLatch(1);
    public void tryLock() {
        zk.create("/lock", threadName.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL, this, "cxt");
        try {
            zk.setData("/", threadName.getBytes(), -1);
            cc.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    public void release() {
        try {
            zk.delete(pathName, -1);
            System.out.println(threadName + ": over work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    /**
     * exist监控，继续监控前一个，如果是第一个，获取锁。。。
     */

    @Override
    public void processResult(int rc, String path, Object ctx, Stat stat) {

    }

    @Override
    public void process(WatchedEvent event) {
        switch (event.getType()) {

            case None:
                break;
            case NodeCreated:
                break;
            case NodeDeleted:
                zk.getChildren("/", false, this, "ctx");
                break;
            case NodeDataChanged:
                break;
            case NodeChildrenChanged:
                break;
            case DataWatchRemoved:
                break;
            case ChildWatchRemoved:
                break;
            case PersistentWatchRemoved:
                break;
        }
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    private String pathName;

    @Override
    public void processResult(int rc, String path, Object ctx, String name) {
        if (name != null) {
            pathName = name;
            System.out.println(threadName + " create " + pathName);
            zk.getChildren("/", false, this, "ctx");
        }
    }

    @Override
    public void processResult(int rc, String path, Object ctx, List<String> children, Stat stat) {
//        System.out.println(threadName + " look locks ...");
//        for (String child : children) {
//            System.out.println(child);
//        }

        Collections.sort(children);
        String substring = pathName.substring(1);
        int i = children.indexOf(substring);
        if (i == 0) {
            //当前是第一个
            System.out.println(threadName + ": i am first.....");
            cc.countDown();
        } else {
            //callback 一定要，exists不一定成功，失败了怎么办？继续监控前一个，如果是第一个，获取锁。。。
            zk.exists("/" + children.get(i - 1), this, this, "ctx");
        }
    }
}
