package org.springframework.samples.annotations.ImportAndImportResouce;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 21:18
 */

public class DriverManagerDataSource implements DataSource {
    private String url;
    private String username;
    private String password;


    public DriverManagerDataSource() {
    }

    public DriverManagerDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


    @Override
    public String toString() {
        return url + ", " + username + ", " + password + ", " + this.getClass().getSimpleName();
    }
}
