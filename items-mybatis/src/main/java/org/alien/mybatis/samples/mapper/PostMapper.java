package org.alien.mybatis.samples.mapper;

import org.alien.mybatis.samples.model.Post;

/**
 * Created by andychen on 2015/5/18.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface PostMapper {

    Post getPostById(int id);
}
