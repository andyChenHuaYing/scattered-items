package org.alien.design.pattern.proxy.issue;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 18:17
 */
public interface BizInterface {
    void proxiedMethod() throws Exception;
    void thisMethod() throws Exception;
    void withoutThisMethod() throws Exception;
}
