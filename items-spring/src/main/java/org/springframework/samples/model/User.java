package org.springframework.samples.model;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/12.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class User {
    private int id;
    private int age;
    private String userName;

    public User() {

    }

    public User(String userName, int age) {

        this.age = age;
        this.userName = userName;
    }

    public User(int id, int age, String userName) {
        this.id = id;
        this.age = age;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
