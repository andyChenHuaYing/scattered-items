package org.springframework.samples.jpetstore.examples;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 19:53
 */
public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {}

    public static ClientService getClientService() {
        return clientService;
    }
}
