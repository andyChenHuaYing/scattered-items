package org.nanshan.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
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
public class DefaultWatcher implements Watcher {

    private static final Logger log = LoggerFactory.getLogger(DefaultWatcher.class);

    private CountDownLatch cc;
    public DefaultWatcher(CountDownLatch cc) {
        this.cc = cc;
    }

    @Override
    public void process(WatchedEvent event) {
        switch (event.getState()) {
            case Unknown:
                break;
            case Disconnected:
                log.info("Disconnected");
                break;
            case NoSyncConnected:
                break;
            case SyncConnected:
                log.info("SyncConnected");

                cc.countDown();
                break;
            case AuthFailed:
                log.info("AuthFailed");

                break;
            case ConnectedReadOnly:
                log.info("ConnectedReadOnly");

                break;
            case SaslAuthenticated:
                break;
            case Expired:
                log.info("Expired");

                break;
            case Closed:
                log.info("Closed");
                break;
        }
    }
}
