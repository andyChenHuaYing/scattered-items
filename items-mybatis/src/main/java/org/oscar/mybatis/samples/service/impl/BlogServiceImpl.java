package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.mapper.BlogMapper;
import org.alien.mybatis.samples.model.Blog;
import org.alien.mybatis.samples.service.BlogService;
import org.alien.mybatis.samples.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by andychen on 2015/5/18.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogWithPosts() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            return blogMapper.getBlogWithPosts();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public Blog getBlogWithPostsNested() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            return blogMapper.getBlogWithPostsNested();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public Blog getBlogOneToOne() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            return blogMapper.getBlogOneToOne();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Blog> getAllBlog() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            return blogMapper.getAllBlog();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
