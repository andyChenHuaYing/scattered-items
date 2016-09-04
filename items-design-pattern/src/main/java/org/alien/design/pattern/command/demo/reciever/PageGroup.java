package org.alien.design.pattern.command.demo.reciever;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class PageGroup extends Group {
    @Override
    public void add() {
        System.out.println("PageGroup.add");
    }

    @Override
    public void delete() {
        System.out.println("PageGroup.delete");
    }

    @Override
    public void find() {
        System.out.println("PageGroup.find");
    }

    @Override
    public void plan() {
        System.out.println("PageGroup.plan");
    }

    @Override
    public void change() {
        System.out.println("PageGroup.change");
    }
}
