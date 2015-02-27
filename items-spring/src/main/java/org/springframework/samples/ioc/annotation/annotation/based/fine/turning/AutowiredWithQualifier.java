package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.samples.model.AbstractPlainModel;

import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 19:55
 */
public class AutowiredWithQualifier {

    @Autowired
    @Qualifier("plainModelOneSingleton")
    private AbstractPlainModel modelOne;
    private AbstractPlainModel modelTwo;
    private AbstractPlainModel modelThree;

    @Autowired
    @Qualifier("plainModel")
    private Set<AbstractPlainModel> models;

    @Autowired
    private AbstractPlainModel primaryCandidate;

    @Autowired
    public AutowiredWithQualifier(@Qualifier("plainModelTwoSingleton") AbstractPlainModel modelTwo) {
        this.modelTwo = modelTwo;
    }

    @Autowired
    public void setModelThree(@Qualifier("plainModelThreeSingleton") AbstractPlainModel modelThree) {
        this.modelThree = modelThree;
    }

    @Override
    public String toString() {
        return "AutowiredWithQualifier{" +
                "modelOne=" + modelOne +
                ", modelTwo=" + modelTwo +
                ", modelThree=" + modelThree +
                ", models=" + models +
                ", primaryCandidate=" + primaryCandidate +
                '}';
    }

}
