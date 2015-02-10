package org.springframework.samples.ioc.annotation.environment.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.*;
import org.springframework.stereotype.Component;

/**
 * Happy daily, happy life.<br>
 * =========================
 * Description:<br>
 * <p>The key is Test Class.</p><br>
 * If no profile is active, the default profile will apply.<br>
 * If any profile is enabled, the default profile will not apply.<br>
 * <p/>
 * Created by andychen on 2015/2/6.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class ProfileAnnotationUsageBean {
    @Autowired(required = false)
    private PlainModelOne plainModelOne;
    @Autowired(required = false)
    private PlainModelTwo plainModelTwo;
    @Autowired(required = false)
    private PlainModelThree plainModelThree;
    @Autowired(required = false)
    private PlainModelFour plainModelFour;
    @Autowired(required = false)
    private PlainModelFive plainModelFive;
    @Autowired(required = false)
    private PlainModelSix plainModelSix;

    @Override
    public String toString() {
        return "ProfileAnnotationUsageBean{" +
                "plainModelOne=" + plainModelOne +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelThree=" + plainModelThree +
                ", plainModelFour=" + plainModelFour +
                ", plainModelFive=" + plainModelFive +
                ", plainModelSix=" + plainModelSix +
                '}';
    }
}
