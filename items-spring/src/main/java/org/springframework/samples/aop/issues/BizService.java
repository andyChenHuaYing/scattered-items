package org.springframework.samples.aop.issues;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 19:26
 */
public interface BizService {
    String proxiedMethod() throws Exception;
    String thisMethod() throws Exception;
    String withoutThisMethod() throws Exception;

}
