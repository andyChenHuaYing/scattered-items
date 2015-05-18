package org.alien.mybatis.samples.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by andychen on 2015/5/8.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class Blog {
    private int id;
    private String title;
    private Author author;
    private List<Post> posts;

    public Blog() {
    }

    public Blog(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Blog{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        if (author != null) {
            sb.append(", author=").append(author);
        }
        if (posts != null) {
            sb.append(", posts=").append(Arrays.toString(posts.toArray(new Post[posts.size()])));
        }
        sb.append('}');
        return sb.toString();
    }
}