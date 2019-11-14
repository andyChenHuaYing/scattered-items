package org.oscar.mybatis.samples.service.impl;

import org.oscar.mybatis.samples.mapper.PostCommentMapper;
import org.oscar.mybatis.samples.model.PostComment;
import org.oscar.mybatis.samples.service.PostCommentService;
import org.oscar.mybatis.samples.util.MybatisUtil;
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
