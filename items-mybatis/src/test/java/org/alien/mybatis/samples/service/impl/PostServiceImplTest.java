package org.alien.mybatis.samples.service.impl;

import junit.framework.Assert;
import org.alien.mybatis.samples.model.Post;
import org.alien.mybatis.samples.service.PostService;
import org.junit.Before;
import org.junit.Test;

public class PostServiceImplTest {

    private PostService postService;

    @Before
    public void setUp() throws Exception {
        postService = new PostServiceImpl();
    }

    @Test
    public void testGetPostById() throws Exception {
        Post post = postService.getPostById(1);
        Assert.assertNotNull(post);
    }
}