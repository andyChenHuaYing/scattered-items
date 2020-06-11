package org.nanshan.zookeeper.lock;

import org.junit.Test;
import org.nanshan.zookeeper.ZkUtil;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class ZkLock {

    @Test
    public void name() throws InterruptedException {



        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                WatchCallback callBack = new WatchCallback();
                callBack.setZk(ZkUtil.getZk("/testLock"));
                String name = Thread.currentThread().getName();
                callBack.setThreadName(name);

                callBack.tryLock();

                System.out.println(name + ": do biz...");

                callBack.release();
            }).start();
        }


        while (true) {
            Thread.sleep(200);
        }
    }
}
