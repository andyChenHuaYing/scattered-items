package org.nanshan.zookeeper.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public class MyConfig {
    private static final Logger log = LoggerFactory.getLogger(MyConfig.class);

    private String cfg;

    public String getCfg() {
        return cfg;
    }

    public void setCfg(String cfg) {
        this.cfg = cfg;
        this.doYourBiz();
    }

    public void doYourBiz() {
        log.info("Current cfg value: {}", cfg);
    }
}
