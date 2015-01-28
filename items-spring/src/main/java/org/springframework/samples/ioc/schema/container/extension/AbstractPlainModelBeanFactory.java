package org.springframework.samples.ioc.schema.container.extension;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.samples.model.AbstractPlainModel;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelThree;
import org.springframework.samples.model.PlainModelTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 22:03
 */
public class AbstractPlainModelBeanFactory implements FactoryBean<AbstractPlainModel> {
    @Override
    public AbstractPlainModel getObject() throws Exception {
        List<AbstractPlainModel> list = new ArrayList<>();
        list.add(new PlainModelOne());
        list.add(new PlainModelTwo());
        list.add(new PlainModelThree());
        Random random = new Random(47);
        return list.get(random.nextInt(3));
    }

    @Override
    public Class<?> getObjectType() {
        return AbstractPlainModel.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public String toString() {
        return "AbstractPlainModelBeanFactory{}";
    }
}
