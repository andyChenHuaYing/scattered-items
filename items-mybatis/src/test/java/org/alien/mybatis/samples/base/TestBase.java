package org.alien.mybatis.samples.base;

import org.alien.mybatis.samples.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

/**
 * Created by andychen on 2015/5/20.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class TestBase {
    protected SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MybatisUtil.getSqlSession();
    }

    @After
    public void after() {
        sqlSession.close();
    }
}
