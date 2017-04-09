package org.alien.design.pattern.composite.common;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/1
 */
public class Client {

    public static void main(String[] args) {
        //创建根节点
        Composite root = new Composite();

        //创建分支
        Composite branch = new Composite();

        //创建叶子节点
        Leaf leaf = new Leaf();

        branch.addComponent(leaf);
        root.addComponent(branch);
        display(root);
    }

    /**
     * 遍历显示根节点下所有叶子子节点
     *
     * @param root 根节点
     */
    public static void display(Composite root) {
        ArrayList<Component> componentArrayList = root.getComponents();
        for (Component component : componentArrayList) {
            if (component instanceof Leaf) {
                System.out.println(component);
            } else {
                display((Composite) component);
            }
        }
    }
}
