package org.springframework.samples.ioc;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 18:55
 */
public class Person {
    private String name;
    private Person spouse;


    public void personInfo(){
        System.out.println("name : " + name + ", spouse : " + spouse);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
