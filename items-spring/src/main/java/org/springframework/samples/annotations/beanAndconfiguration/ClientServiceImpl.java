package org.springframework.samples.annotations.beanAndconfiguration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 20:08
 */
public class ClientServiceImpl implements ClientService {
    private ClientDao clientDao;

    public ClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}
