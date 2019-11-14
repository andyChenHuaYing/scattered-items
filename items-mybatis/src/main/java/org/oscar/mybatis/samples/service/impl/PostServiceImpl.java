package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.mapper.PostMapper;
import org.alien.mybatis.samples.model.Post;
import org.alien.mybatis.samples.service.PostService;
import org.alien.mybatis.samples.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by andychen on 2015/5/18.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class PostServiceImpl implements PostService {

    @Override
    public Post getPostById(int id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            return postMapper.getPostById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return null;
    }
}
