package org.nanshan.zookeeper;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class ZkTest extends ZookeeperTestSupport {

    private static final Logger log = LoggerFactory.getLogger(ZkTest.class);

    @Test
    public void conn() throws KeeperException, InterruptedException {
        String s = zk.create("/ooxx", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        System.out.println(s);
    }

    @Test
    public void callback() throws Exception {
        CountDownLatch cc = new CountDownLatch(2);
        zk.exists("/ooxx", event -> {
            log.info("event【{}】", event.toString());
            cc.countDown();
        }, (rc, path, ctx, stat) -> {
            log.info("statCallback【{}】", +rc + ":" + path + ":" + ctx + ":" + stat);

            cc.countDown();
        }, "ctx");

//        String s = zk.create("/ooxx", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//        log.info("path【{}】", s);
        cc.await();
    }
}
