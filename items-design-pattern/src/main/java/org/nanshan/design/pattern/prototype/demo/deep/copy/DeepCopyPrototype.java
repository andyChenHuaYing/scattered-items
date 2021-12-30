package org.nanshan.design.pattern.prototype.demo.deep.copy;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class DeepCopyPrototype implements Cloneable {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public DeepCopyPrototype clone() throws CloneNotSupportedException {
        DeepCopyPrototype deepCopyPrototype = null;
        try {
            deepCopyPrototype = (DeepCopyPrototype) super.clone();
            @SuppressWarnings("unchecked")
            ArrayList<String> list = (ArrayList<String>) this.list.clone();
            deepCopyPrototype.setList(list);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepCopyPrototype;
    }
}
