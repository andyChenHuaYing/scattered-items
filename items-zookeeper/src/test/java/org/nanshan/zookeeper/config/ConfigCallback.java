package org.nanshan.zookeeper.config;

import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class ConfigCallback implements Watcher, AsyncCallback.DataCallback, AsyncCallback.StatCallback {
    private static final Logger log = LoggerFactory.getLogger(ConfigCallback.class);

    private MyConfig cfg;
    private ZooKeeper zk;
    private static final String APP_CFG_PATH = "/AppConf";

    public void setCfg(MyConfig cfg) {
        this.cfg = cfg;
    }

    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    public void await() {
        try {
            zk.exists(APP_CFG_PATH, this, this, "ctx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processResult(int i, String s, Object o, byte[] data, Stat stat) {
        Object o1 = data == null ? null : new String(data);
        log.info("data: {}", o1);
        if (data != null) {
            cfg.setCfg(new String(data));
        }
    }

    @Override
    public void process(WatchedEvent event) {
        log.info("event:{}", event.toString());
        switch (event.getType()) {

            case None:
                log.info("None");

                break;
            case NodeCreated:
                log.info("NodeCreated");

                zk.getData(APP_CFG_PATH, this, this, "context");
                break;
            case NodeDeleted:
                log.info("NodeDeleted");

                cfg.setCfg("");
                this.await();
                break;
            case NodeDataChanged:
                log.info("NodeDataChanged");

                zk.getData(APP_CFG_PATH, this, this, "context");
                break;
            case NodeChildrenChanged:
                log.info("NodeChildrenChanged");


                break;
            case DataWatchRemoved:
                log.info("DataWatchRemoved");

                break;
            case ChildWatchRemoved:
                log.info("ChildWatchRemoved");


                break;
            case PersistentWatchRemoved:
                log.info("PersistentWatchRemoved");

                break;
        }
    }

    @Override
    public void processResult(int rc, String path, Object ctx, Stat stat) {
        log.info("Path: {}, Stat:{}", path, stat);
        if (stat != null) {
            zk.getData(APP_CFG_PATH, this, this, "context");
        }
    }
}
