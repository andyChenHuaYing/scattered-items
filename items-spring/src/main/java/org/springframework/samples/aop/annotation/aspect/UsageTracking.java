package org.springframework.samples.aop.annotation.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.annotation.Order;
import org.springframework.samples.aop.annotation.service.UsageTracked;
import org.springframework.samples.aop.annotation.service.UsageTrackedImpl;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-19 22:10
 */
@Component
@Aspect
@Order(99)
public class UsageTracking {
    @DeclareParents(value = "org.springframework.samples.aop.annotation.service.*+",
            defaultImpl = UsageTrackedImpl.class)
    public UsageTracked usageTracked;
    /**
     * Demonstrate introductions' usage
     */
    @Before("execution(* org.springframework.samples.aop.annotation.action.UserAction." +
            "demonstrateOtherPointcutPatternExpression()) && this(usageTracked)")
    public void declaredParentBefore(UsageTracked usageTracked) {
        System.out.println("usage count : " + usageTracked.incrementUseCount() + ", and order : 99");
    }
}
