package org.nanshan.zookeeper;

import org.apache.zookeeper.ZooKeeper;

import java.util.concurrent.CountDownLatch;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class ZkUtil {
    public static ZooKeeper getZk(String namespace) {
        CountDownLatch cc =new CountDownLatch(1);
        ZooKeeper zooKeeper = null;
        try {
             zooKeeper = new ZooKeeper("10.211.55.5:2181,10.211.55.6:2181,10.211.55.7:2181,10.211.55.8:2181" + namespace, 300000, new DefaultWatcher(cc));
            cc.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zooKeeper;
    }
}
