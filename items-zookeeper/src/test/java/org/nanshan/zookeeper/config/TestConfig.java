package org.nanshan.zookeeper.config;

import org.junit.Test;
import org.nanshan.zookeeper.ZookeeperTestSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class TestConfig extends ZookeeperTestSupport {
    private static final Logger log = LoggerFactory.getLogger(TestConfig.class);

    @Test
    public void testConfigUpdate() throws IOException {
        ConfigCallback callback = new ConfigCallback();
        MyConfig myConfig = new MyConfig();
        callback.setCfg(myConfig);
        callback.setZk(zk);

        callback.await();

        System.in.read();
        log.info("Bye...");
    }

    @Override
    protected String namespace() {
        return "/testConfig";
    }
}
