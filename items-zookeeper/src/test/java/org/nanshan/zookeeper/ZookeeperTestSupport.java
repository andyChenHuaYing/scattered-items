package org.nanshan.zookeeper;

import org.apache.zookeeper.ZooKeeper;
import org.junit.After;
import org.junit.Before;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/5/17
 */
public abstract class ZookeeperTestSupport {
    protected ZooKeeper zk;

    protected String namespace(){
        return "/";
    }

    @Before
    public void setUp() throws Exception {
        zk = ZkUtil.getZk(namespace());
    }

    @After
    public void tearDown() throws Exception {
        zk.close();
    }
}
