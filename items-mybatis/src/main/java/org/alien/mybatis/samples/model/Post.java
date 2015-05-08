package org.alien.mybatis.samples.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by andychen on 2015/5/8.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class Post {
    private int id;
    private String subject;
    private Author author;
    private List<PostComment> comments;
    private List<Tag> tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<PostComment> getComments() {
        return comments;
    }

    public void setComments(List<PostComment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", author=" + author +
                ", comments=" + Arrays.toString(comments.toArray(new PostComment[comments.size()])) +
                ", tags=" + Arrays.toString(tags.toArray(new Tag[tags.size()])) +
                '}';
    }
}
