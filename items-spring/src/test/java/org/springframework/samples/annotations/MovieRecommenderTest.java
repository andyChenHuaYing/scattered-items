package org.springframework.samples.annotations;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class MovieRecommenderTest extends TestBase{
    public MovieRecommenderTest() {
        super("spring-annotation.xml");
    }

    @Test
    public void testShowReferences() throws Exception {
        MovieRecommender movieRecommender = getBean(MovieRecommender.class);
        movieRecommender.showReference();

    }
}