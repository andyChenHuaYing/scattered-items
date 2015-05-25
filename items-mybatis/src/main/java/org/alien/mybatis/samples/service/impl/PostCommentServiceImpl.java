package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.mapper.PostCommentMapper;
import org.alien.mybatis.samples.model.PostComment;
import org.alien.mybatis.samples.service.PostCommentService;
import org.alien.mybatis.samples.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by andy on 5/19/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class PostCommentServiceImpl implements PostCommentService {
    @Override
    public PostComment selectPostComment() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            PostCommentMapper postCommentMapper = sqlSession.getMapper(PostCommentMapper.class);
            return postCommentMapper.selectPostComment();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
