package org.springframework.samples.ioc.annotation.environment.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.samples.model.*;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * <p>The key is Test Class.</p><br>
 * If no profile is active, the default profile will apply.<br>
 * If any profile is enabled, the default profile will not apply.<br>
 * Created by andychen on 2015/2/6.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Configuration
@ImportResource("classpath:spring_configuration/ioc/annotation/spring-ioc-annotation-profile.xml")
public class ProfileXMLUsageBean {
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
        return "ProfileXMLUsageBean{" +
                "plainModelOne=" + plainModelOne +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelThree=" + plainModelThree +
                ", plainModelFour=" + plainModelFour +
                ", plainModelFive=" + plainModelFive +
                ", plainModelSix=" + plainModelSix +
                '}';
    }
}
