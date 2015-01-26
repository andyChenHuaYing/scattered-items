package org.springframework.samples.ioc.schema.injection.autowire;

import org.springframework.samples.model.AbstractPlainModel;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 20:13
 */
public class MultipleAutowireBean {
    private Map<String, AbstractPlainModel> map;
    private List<AbstractPlainModel> list;
    private Set<AbstractPlainModel> set;
    private AbstractPlainModel[] abstractPlainModels;

    public Map<String, AbstractPlainModel> getMap() {
        return map;
    }

    public void setMap(Map<String, AbstractPlainModel> map) {
        this.map = map;
    }

    public List<AbstractPlainModel> getList() {
        return list;
    }

    public void setList(List<AbstractPlainModel> list) {
        this.list = list;
    }

    public Set<AbstractPlainModel> getSet() {
        return set;
    }

    public void setSet(Set<AbstractPlainModel> set) {
        this.set = set;
    }

    public AbstractPlainModel[] getAbstractPlainModels() {
        return abstractPlainModels;
    }

    public void setAbstractPlainModels(AbstractPlainModel[] abstractPlainModels) {
        this.abstractPlainModels = abstractPlainModels;
    }
}
