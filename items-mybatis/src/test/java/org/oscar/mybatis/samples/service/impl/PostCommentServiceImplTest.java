package org.oscar.mybatis.samples.service.impl;

import junit.framework.Assert;
import org.oscar.mybatis.samples.model.PostComment;
import org.oscar.mybatis.samples.service.PostCommentService;
import org.junit.Before;
import org.junit.Test;

public class PostCommentServiceImplTest {

    private PostCommentService postCommentService;

    @Before
    public void setUp() throws Exception {
        postCommentService = new PostCommentServiceImpl();
    }

    @Test
    public void testSelectPostComment() throws Exception {
        PostComment postComment = postCommentService.selectPostComment();
        Assert.assertNotNull(postComment);
    }
}