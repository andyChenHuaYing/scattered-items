package org.alien.mybatis.samples.mapper;

import junit.framework.Assert;
import org.alien.mybatis.samples.entity.Page;
import org.alien.mybatis.samples.model.Author;
import org.alien.mybatis.samples.util.MybatisUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andy on 5/20/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class AuthorMapperTest {

    private AuthorMapper authorMapper;

    public AuthorMapperTest() {
        this.authorMapper = MybatisUtil.getSqlSession().getMapper(AuthorMapper.class);
    }

    @Test
    public void testUpdateAuthor() throws Exception {
        Author author = new Author(1, "alien", "alien", "email", "bio", "fa");
        List<Author> authors = this.authorMapper.getAllAuthors();
        Assert.assertNotNull(authors);
    }

    @Test
    public void testSelectAuthorByPage() throws Exception {
        Page page = new Page();
        Map<String, Object> map = new HashMap<>();
        map.put("page", page);
        List<Author> authors = this.authorMapper.selectAuthorByPage(map);
        Assert.assertEquals(5, authors.size());
    }
}