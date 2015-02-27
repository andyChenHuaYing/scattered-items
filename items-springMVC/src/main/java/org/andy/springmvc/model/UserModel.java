package org.andy.springmvc.model;

import javax.validation.constraints.NotNull;

/**
 * Happy daily, happy life.
 * Created by andychen on 2015/1/20.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class UserModel {
    @NotNull(message = "userName.not.empty")//userName.not.empty
//    @NotNull  //不能为null.
    private String userName;
    private String password;
    private SchoolModel schoolModel;

    public UserModel() {}

    public UserModel(String userName, String password, SchoolModel schoolModel) {

        this.userName = userName;
        this.password = password;
        this.schoolModel = schoolModel;
    }

    public SchoolModel getSchoolModel() {
        return schoolModel;
    }

    public void setSchoolModel(SchoolModel schoolModel) {
        this.schoolModel = schoolModel;
    }

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
                ", schoolModel=" + schoolModel +
                '}';
    }
}
