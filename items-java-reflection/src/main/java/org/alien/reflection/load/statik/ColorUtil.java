package org.alien.reflection.load.statik;

import org.alien.reflection.load.demo.Blue;
import org.alien.reflection.load.demo.Red;
import org.alien.reflection.load.demo.Yellow;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 22:10
 */
public class ColorUtil {
    private String colorClass;

    public ColorUtil(String colorClass) {
        this.colorClass = colorClass;
    }

    /**
     * Static load class by full class name, if any of them not exist ,like Skyblue , then all functions around this
     * class will not work and you must change the world if you want to add, delete, or update some of the color.
     */
    public void showRGB() {
        if ("org.alien.reflection.load.demo.Red".equals(colorClass)) {
            Red red = new Red();
            red.showRGB();
        }
        if ("org.alien.reflection.load.demo.Blue".equals(colorClass)) {
            Blue blue = new Blue();
            blue.showRGB();
        }
        if ("org.alien.reflection.load.demo.Yellow".equals(colorClass)) {
            Yellow yellow = new Yellow();
            yellow.showRGB();
        }
        /*
        if ("org.alien.reflection.load.demo.SkyBlue".equals(colorClass)) {
            SkyBlue skyBlue = new SkyBlue();
            SkyBlue.showRGB();
        }*/
    }
}
