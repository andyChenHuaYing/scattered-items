package org.springframework.samples.ioc.schema.instantiation.factory;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-23 23:20
 */
public class InstantiateBeanNormalFactory {
    private static int count = 0;
    private static PlainModelOne plainModelOne;
    /**
     * I want to control PlainModelOne instance's singleton by this property.But it's failed.Reason is written on
     * instantiatePlainModelOne method's specification.
     */
    private String scope = "singleton";

    public void setScope(String scope) {
        if (!scope.equals("singleton") && !scope.equals("prototype")) {
            throw new IllegalArgumentException("Scope value could only be singleton or prototype !");
        } else {
            this.scope = scope;
        }
    }

    /**
     * Produce an instance of PlainModelOne, if scope is singleton than this method will only instantiate PlainModelOne
     * once, exclude other instance which are instantiated in other ApplicationContext. So it is not the real singleton.
     * But, before invoke this method to instantiate PlainModelOne, Spring will check if PlainScope's instance exists in
     * ApplicationContext when the bean's scope="singleton", execute it if not.else return the exist instance.
     *
     * @return Instance of PlainModelOne.
     */
    public PlainModelOne instantiatePlainModelOne() {
        System.out.println(++count);//count == 1;
        if (scope.equals("singleton")) {
            return plainModelOne == null ? plainModelOne = new PlainModelOne() : plainModelOne;
        } else {
            return new PlainModelOne();
        }
    }
}

