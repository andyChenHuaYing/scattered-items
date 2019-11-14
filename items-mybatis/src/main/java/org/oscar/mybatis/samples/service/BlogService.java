package org.oscar.mybatis.samples.service;

import org.oscar.mybatis.samples.model.Blog;

import java.util.List;

/**
 * Created by andychen on 2015/5/18.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface BlogService {

    Blog getBlogWithPosts();

    Blog getBlogWithPostsNested();

    /**
     * Only fill id, Author properties of Blog.
     *
     * @return Blog info with id and author.
     */
    Blog getBlogOneToOne();

    /**
     * Get Blog full info.
     *
     * @return Blog
     */
    List<Blog> getAllBlog();

}
