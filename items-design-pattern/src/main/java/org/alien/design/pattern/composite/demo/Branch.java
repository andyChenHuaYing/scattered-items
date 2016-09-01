package org.alien.design.pattern.composite.demo;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/1
 */
public class Branch extends Corp {

    private ArrayList<Corp> corpArrayList = new ArrayList<>();

    public Branch(String name, String position, String salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        corp.setParent(this);
        this.corpArrayList.add(corp);
    }

    public void removeSubordinate(Corp corp) {
        this.corpArrayList.remove(corp);
    }

    public ArrayList<Corp> getCorpArrayList() {
        return this.corpArrayList;
    }
}
