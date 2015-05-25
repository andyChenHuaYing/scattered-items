package org.alien.mybatis.samples.mapper;

import org.alien.mybatis.samples.model.Author;

import java.util.List;
import java.util.Map;

/**
 * Created by andychen on 2015/5/8.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface AuthorMapper {

    List<Author> selectAuthorByPage(Map<String, Object> map);

    int addAuthor(Author author);

    int deleteAuthor(int id);

    int updateAuthor(Author author);

    List<Author> getAllAuthors();

    int getAllAuthorsCount();


}
