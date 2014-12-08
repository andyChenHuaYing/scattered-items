package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class SimpleMovieListerAnnotationTest extends TestBase{

    public SimpleMovieListerAnnotationTest() {
        super("spring.xml");
    }

    @Test
    public void testMovieName() throws Exception {
//        SimpleMovieLister movieLister = getBean("simpleMovieLister");
//        movieLister.movieName("Alien 4");
//        movieLister.fooReference();
    }
}