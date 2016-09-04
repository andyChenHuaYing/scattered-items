package org.alien.design.pattern.command.demo.command;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class DeleteCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.delete();
        super.pageGroup.delete();
        super.codeGroup.delete();
        System.out.println("DeleteCommand.execute");
    }
}
