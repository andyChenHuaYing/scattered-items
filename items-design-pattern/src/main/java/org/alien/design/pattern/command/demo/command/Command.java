package org.alien.design.pattern.command.demo.command;

import org.alien.design.pattern.command.demo.reciever.CodeGroup;
import org.alien.design.pattern.command.demo.reciever.PageGroup;
import org.alien.design.pattern.command.demo.reciever.RequirementGroup;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public abstract class Command {

    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected RequirementGroup requirementGroup = new RequirementGroup();

    public abstract void execute();
}
