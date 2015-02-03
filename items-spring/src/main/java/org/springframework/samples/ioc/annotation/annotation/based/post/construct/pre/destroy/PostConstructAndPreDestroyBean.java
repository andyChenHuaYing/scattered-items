package org.springframework.samples.ioc.annotation.annotation.based.post.construct.pre.destroy;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/2/3.
 * Version 1.0-SNAPSHOT
 */
public class PostConstructAndPreDestroyBean {

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() + " init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " destroy.");
    }
}
