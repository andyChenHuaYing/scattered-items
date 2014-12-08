package org.springframework.samples.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-19 19:12
 */
public class MovieRecommender {
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    @Qualifier("movieCatalogOne")
    private  MovieCatalog movieCatalog;
    @Autowired
    private MovieCatalog[] movieCatalogs;
    @Autowired
    private Set<MovieCatalog> movieCatalogSet;
    @Autowired
    private Map<String, MovieCatalog> movieCatalogMap;






    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    public void showReference() {
        System.out.println(movieCatalog);
        System.out.println(customerPreferenceDao);
    }
}
