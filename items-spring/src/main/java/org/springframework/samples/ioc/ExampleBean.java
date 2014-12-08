package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

import java.beans.ConstructorProperties;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:42
 */
public class ExampleBean {
    private String email;
    private String gmail;
    private int year;
    private String ultimateAnswer;

    public ExampleBean() {
    }

    @ConstructorProperties({"year", "ultimateAnswer"})
    public ExampleBean(int year, String ultimateAnswer) {
        this.year = year;
        this.ultimateAnswer = ultimateAnswer;
    }

    public void conclusion(){
        System.out.println(ToString.toString(this.getClass()));
        System.out.println("Year : " + year + ", answer : " + ultimateAnswer );
    }

    public void emailAndGmail(){
        System.out.println("email : " + email);
        System.out.println("gmail : "+ gmail);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
