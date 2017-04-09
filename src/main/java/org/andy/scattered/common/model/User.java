package org.andy.scattered.common.model;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class User {

    private String userName;

    private String realName;

    private String password;

    private String company;

    private String[] objectClass;

    private String description;

    public User(String userName, String company) {
        this.userName = userName;
        this.company = company;
    }

    public User(String userName, String realName, String password) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
    }

    public User(String userName, String realName, String password, String company) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.company = company;
    }

    public User(String userName, String realName, String password, String company, String description) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.company = company;
        this.description = description;
    }

    public User() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String[] objectClass) {
        this.objectClass = objectClass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
