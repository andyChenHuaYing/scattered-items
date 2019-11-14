package org.oscar.mybatis.samples.service;

import org.oscar.mybatis.samples.model.Author;

import java.util.List;

/**
 * Created by andychen on 2015/5/18.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface AuthorService {

    int addAuthor(Author author);

    int deleteAuthor(int id);

    int updateAuthor(Author author);

    List<Author> getAllAuthors();

    int getAllAuthorsCount();
}
