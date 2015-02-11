package org.springframework.samples.aop.schema.introduction;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-15 22:34
 */
public class FilterServiceImpl implements FilterService {
    @Override
    public void filter() {
        System.out.println(this.getClass().getSimpleName() + " filter...");
    }
}
