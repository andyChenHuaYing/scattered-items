package org.springframework.samples.annotations.lookupInject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.utils.ShowReferencesUtil;

public class AppConfigTest {
    AnnotationConfigApplicationContext context;
    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
    }

    @After
    public void after() {
        context.close();
    }

    @Test
    public void testLookUpMethod() throws Exception {
        AsyncCommand asyncCommand = context.getBean(AsyncCommand.class);
        AsyncCommand asyncCommand1 = (AsyncCommand) context.getBean("asyncCommand");

        CommandManager commandManager = context.getBean(CommandManager.class);
        CommandManager commandManager1 = (CommandManager) context.getBean("commandManager");

        ShowReferencesUtil.showReferences(asyncCommand, asyncCommand1, commandManager, commandManager1);

    }
}