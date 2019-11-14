package org.oscar.mybatis.samples.service.impl;

import junit.framework.Assert;
import org.oscar.mybatis.samples.model.Blog;
import org.oscar.mybatis.samples.service.BlogService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BlogServiceImplTest {

    private BlogService blogService;

    @Before
    public void setUp() throws Exception {
        blogService = new BlogServiceImpl();
    }

    @Test
    public void testGetBlogOneToOne() throws Exception {
        Blog blog = blogService.getBlogOneToOne();
        Assert.assertNotNull(blog);
    }

    @Test
    public void testGetBlogOneToMany() throws Exception {

    }

    @Test
    public void testGetAllBlog() throws Exception {
        List<Blog> blogList = blogService.getAllBlog();
        Assert.assertNotNull(blogList);
    }

    @Test
    public void testGetBlogWithPosts() throws Exception {
        Blog blog = blogService.getBlogWithPosts();
        Assert.assertNotNull(blog);
    }

    @Test
    public void testGetBlogWithPostsNested() throws Exception {
        Blog blog = blogService.getBlogWithPostsNested();
        Assert.assertNotNull(blog);
    }
}