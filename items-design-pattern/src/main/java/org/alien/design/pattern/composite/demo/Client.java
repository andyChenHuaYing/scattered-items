package org.alien.design.pattern.composite.demo;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/1
 */
public class Client {

    public static void main(String[] args) {
        Branch ceo = new Branch("张三", "CEO", "20000");

        Branch manager1 = new Branch("李四", "MANAGER", "10000");
        Leaf leafA = new Leaf("职员A", "STAFF", "2000");
        Leaf leafB = new Leaf("职员B", "STAFF", "2000");
        Leaf leafC = new Leaf("职员C", "STAFF", "2000");
        Leaf leafD = new Leaf("职员D", "STAFF", "2000");

        Branch manager2 = new Branch("王五", "MANAGER", "10000");
        Leaf leafE = new Leaf("职员E", "STAFF", "2000");
        Leaf leafF = new Leaf("职员F", "STAFF", "2000");
        Leaf leafG = new Leaf("职员G", "STAFF", "2000");

        Leaf leafH = new Leaf("职员H", "STAFF", "2000");

        //组装树
        manager1.addSubordinate(leafA);
        manager1.addSubordinate(leafB);
        manager1.addSubordinate(leafC);
        manager1.addSubordinate(leafD);

        manager2.addSubordinate(leafE);
        manager2.addSubordinate(leafF);
        manager2.addSubordinate(leafG);

        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);
        ceo.addSubordinate(leafH);

        System.out.println(getTreeInfo(ceo));

    }

    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> corps = root.getCorpArrayList();
        String info = "";
        for (Corp corp : corps) {
            if (corp instanceof Leaf) {
                info += corp.getInfo() + "\n";
            } else {
                info += corp.getInfo() + "\n" + getTreeInfo((Branch) corp);
            }
        }
        return info;
    }
}
