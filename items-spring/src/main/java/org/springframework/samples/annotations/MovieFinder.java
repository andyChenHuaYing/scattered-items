package org.springframework.samples.annotations;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:03
 */
public class MovieFinder {
    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public void movieName(String name){
        System.out.println(this.getClass().getName() + " :: movie name : " + name);
    }
}
