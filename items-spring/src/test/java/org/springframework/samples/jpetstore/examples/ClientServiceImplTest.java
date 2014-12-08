package org.springframework.samples.jpetstore.examples;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class ClientServiceImplTest extends TestBase{
    public ClientServiceImplTest() {
        super("spring.xml");
    }

    @Test
    public void testConnectionInof() throws Exception {
        ClientServiceImpl clientService = getBean(ClientServiceImpl.class);
        clientService.connectionInof("localhost", "8080");
    }
}