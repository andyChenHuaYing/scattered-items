package org.nanshan.design.pattern.command.demo.reciever;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class CodeGroup extends Group {
    @Override
    public void add() {
        System.out.println("CodeGroup.add");
    }

    @Override
    public void delete() {
        System.out.println("CodeGroup.delete");
    }

    @Override
    public void find() {
        System.out.println("CodeGroup.find");
    }

    @Override
    public void plan() {
        System.out.println("CodeGroup.plan");
    }

    @Override
    public void change() {
        System.out.println("CodeGroup.change");
    }
}
