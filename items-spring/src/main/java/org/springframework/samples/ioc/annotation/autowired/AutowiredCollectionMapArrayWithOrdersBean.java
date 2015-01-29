package org.springframework.samples.ioc.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.AbstractPlainModel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-29 22:11
 */
public class AutowiredCollectionMapArrayWithOrdersBean {
    private Map<String, AbstractPlainModel> map;
    @Autowired
    private List<AbstractPlainModel> list;
    private Set<AbstractPlainModel> set;

    private AbstractPlainModel[] abstractPlainModels;

    @SuppressWarnings("unused")
    public AutowiredCollectionMapArrayWithOrdersBean() {
    }

    @Autowired(required = false)
    public AutowiredCollectionMapArrayWithOrdersBean(Set<AbstractPlainModel> set) {
        this.set = set;
    }

    @Autowired(required = false)// will be performed : greediest
    public AutowiredCollectionMapArrayWithOrdersBean(AbstractPlainModel[] abstractPlainModels, Set<AbstractPlainModel> set) {
        this.abstractPlainModels = abstractPlainModels;
        this.set = set;
    }

    @Autowired
    public void setMap(Map<String, AbstractPlainModel> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "AutowiredCollectionMapArrayWithOrdersBean{" +
                "map=" + map +
                ", list=" + list +
                ", set=" + set +
                ", abstractPlainModels=" + Arrays.toString(abstractPlainModels) +
                '}';
    }
}
