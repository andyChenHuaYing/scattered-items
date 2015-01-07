package org.alien.reflection.load.dynamic;

import org.alien.reflection.load.demo.Color;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 22:02
 */
public class ColorUtil {
    private String colorClass;

    public ColorUtil(String colorClass) {
        this.colorClass = colorClass;
    }

    /**
     * Dynamic load detail color class type.Never mind it exist or not and if you want to change another one,
     * just add an class which achieve the color interface and implements the showRGB method. 
     */
    public void showRGB() {
        Class colorClazz = null;
        try {
            colorClazz = Class.forName(colorClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Color color = null;
        try {
            color = (Color) colorClazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        color.showRGB();
    }
}
