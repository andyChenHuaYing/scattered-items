package org.springframework.samples.ioc.annotation.annotation.based.post.construct.pre.destroy;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class PostConstructAndPreDestroyBeanTest extends TestBase {

    public PostConstructAndPreDestroyBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-jsr-250-post-construct-pre-destroy.xml");
    }

    @Test
    public void testPostConstructAndPreDestroyAnnotation() throws Exception {
    }
}