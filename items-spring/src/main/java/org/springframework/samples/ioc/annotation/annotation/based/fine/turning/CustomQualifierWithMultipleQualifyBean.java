package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.AbstractPlainModel;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 21:06
 */
public class CustomQualifierWithMultipleQualifyBean {
    @Autowired
    @CustomQualifierWithMultipleQualify(ruleOne = "plainModelFourSingletonMultipleQualify", enumRule = EnumRuleTwo.FOUR)
    private AbstractPlainModel abstractPlainModel;

    @Override
    public String toString() {
        return "CustomQualifierWithMultipleQualifyBean{" +
                "abstractPlainModel=" + abstractPlainModel +
                '}';
    }
}
