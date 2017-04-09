package org.springframework.samples.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-19 18:42
 */
public class SimpleMovieListerAnnotation {
    private MovieFinder movieFinder;

    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void showReferences() {
        System.out.println("movieFinder : " + movieFinder);
    }
}
