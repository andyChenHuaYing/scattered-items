package org.springframework.samples.ioc;

import org.springframework.samples.annotations.MovieFinder;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:02
 */
public class SimpleMovieLister {
    private Foo foo;
    private MovieFinder movieFinder;

    public SimpleMovieLister() {
    }

    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void setFoo(Foo foo) {
        System.out.println("Foo bean is instantiated...");
        this.foo = foo;
    }

    public void movieName(String name) {
        movieFinder.movieName(name);
    }

    public void fooReference() {
        System.out.println(foo.toString());
    }


}

