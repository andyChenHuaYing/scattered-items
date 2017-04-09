package org.alien.design.pattern.prototype.demo.shadow.copy;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ShadowPrototype implements Cloneable {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public ShadowPrototype clone() throws CloneNotSupportedException {
        return (ShadowPrototype) super.clone();
    }
}
