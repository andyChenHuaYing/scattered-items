package org.andy.springmvc.model;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/20.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class UserModel {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
