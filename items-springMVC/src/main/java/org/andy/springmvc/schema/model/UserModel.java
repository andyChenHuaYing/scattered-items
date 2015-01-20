package org.andy.springmvc.schema.model;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/20.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class UserModel {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
