package org.springframework.samples.model.annotation;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class CustomDataSourceModel {
    private String url;
    private String username;
    private String password;

    public CustomDataSourceModel(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomDataSourceModel{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
