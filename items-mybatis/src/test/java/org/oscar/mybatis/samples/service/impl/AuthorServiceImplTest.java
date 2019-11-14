package org.alien.mybatis.samples.service.impl;

import junit.framework.Assert;
import org.alien.mybatis.samples.model.Author;
import org.alien.mybatis.samples.service.AuthorService;
import org.junit.Before;
import org.junit.Test;

public class AuthorServiceImplTest {
    private AuthorService authorService;

    @Before
    public void setUp() throws Exception {
        authorService = new AuthorServiceImpl();
    }

    @Test
    public void testGetAllAuthors() throws Exception {
        Assert.assertEquals(true, authorService.getAllAuthors().size() > 0);
    }

    @Test
    public void getAllAuthorsCount() throws Exception {
        Assert.assertEquals(true, authorService.getAllAuthorsCount() > 0);
    }

    @Test
    public void testAddAuthor() throws Exception {
        Assert.assertEquals(true, authorService.addAuthor(new Author(3, "year")) > 0);
    }

    @Test
    public void testDeleteAuthor() throws Exception {
        Assert.assertEquals(true, authorService.deleteAuthor(3) > 0);
    }

    @Test
    public void testUpdateAuthor() throws Exception {
        Assert.assertEquals(true, authorService.updateAuthor(new Author(2, "star_year")) > 0);
    }
}