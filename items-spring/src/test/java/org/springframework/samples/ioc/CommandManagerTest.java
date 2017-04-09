package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.OrderUtils;

import java.util.HashMap;
import java.util.Map;

public class CommandManagerTest extends TestBase {
    public CommandManagerTest() {
        super("spring-method-injection.xml");
    }

    @Test
    public void testScopePrototype() throws Exception {
        Map<String, Boolean> state = new HashMap<String, Boolean>();
        CommandManager commandManager = getBean(CommandManager.class);
        while (OrderUtils.order < 10) {
            commandManager.process(state);
        }
    }
}