package org.springframework.samples.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-19 19:57
 */
public class QualifierAnnotation {
    private MovieCatalog movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public QualifierAnnotation(@Qualifier("movieCatalogOne") MovieCatalog movieCatalog,
                               CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }

    public void showReferences() {
        ShowReferencesUtil.showReferences(movieCatalog, customerPreferenceDao);
    }
}
