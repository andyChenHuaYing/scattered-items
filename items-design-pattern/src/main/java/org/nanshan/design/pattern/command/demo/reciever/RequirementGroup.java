package org.nanshan.design.pattern.command.demo.reciever;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class RequirementGroup extends Group {
    @Override
    public void add() {
        System.out.println("RequirementGroup.add");
    }

    @Override
    public void delete() {
        System.out.println("RequirementGroup.delete");
    }

    @Override
    public void find() {
        System.out.println("RequirementGroup.find");
    }

    @Override
    public void plan() {
        System.out.println("RequirementGroup.plan");
    }

    @Override
    public void change() {
        System.out.println("RequirementGroup.change");
    }
}
