package org.nanshan.design.pattern.flyweight.demo.model;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
@SuppressWarnings("unused")
public class SignInfo {
    private String id;
    private String subject;
    private String location;
    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", location='" + location + '\'' +
                ", postAddress='" + postAddress + '\'' +
                '}';
    }
}
