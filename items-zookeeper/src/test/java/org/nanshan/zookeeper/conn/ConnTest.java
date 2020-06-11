package org.nanshan.zookeeper.conn;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;
import org.nanshan.zookeeper.DefaultWatcher;

import java.util.concurrent.CountDownLatch;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/18
 */
public class ConnTest {

    @Test
    public void name() throws InterruptedException {
        CountDownLatch cc =new CountDownLatch(1);
        ZooKeeper zooKeeper = null;
        try {
            zooKeeper = new ZooKeeper("10.211.55.5:2181,10.211.55.6:2181,10.211.55.7:2181,10.211.55.8:2181", 3000, new DefaultWatcher(cc));
            cc.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(4000);
//        zooKeeper.close();

        try {
//            zooKeeper.exists("/", false);
            System.out.println("asaaa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {

        }
    }

}
