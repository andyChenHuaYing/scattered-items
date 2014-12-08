package org.springframework.samples.annotations;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-19 19:34
 */
public class MultipleAutoaware {


    private Set<MovieCatalog> movieCatalogSetConstructor;
    private Map<String, MovieCatalog> movieCatalogMapConstructor;
    private MovieCatalog[] movieCatalogsConstructor;

    @Autowired
    public MultipleAutoaware(MovieCatalog[] movieCatalogsConstructor, Set<MovieCatalog> movieCatalogSetConstructor,
                            Map<String, MovieCatalog> movieCatalogMapConstructor) {
        this.movieCatalogsConstructor = movieCatalogsConstructor;
        this.movieCatalogSetConstructor = movieCatalogSetConstructor;
        this.movieCatalogMapConstructor = movieCatalogMapConstructor;
    }

    public MultipleAutoaware() {
    }

    public void showSet() {
        for (MovieCatalog movieCatalog : movieCatalogSetConstructor) {
            System.out.println(movieCatalog);
        }
    }

    public void showArray() {
        for (MovieCatalog movieCatalog : movieCatalogsConstructor) {
            System.out.println(movieCatalog);
        }
    }

    public void showMap() {
        Set<String> keys = movieCatalogMapConstructor.keySet();
        for (String key : keys) {
            System.out.println("key : " + key + ", " + movieCatalogMapConstructor.get(key));
        }
    }

}
