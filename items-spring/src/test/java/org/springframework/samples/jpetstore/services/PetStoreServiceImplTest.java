package org.springframework.samples.jpetstore.services;


import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class PetStoreServiceImplTest extends TestBase{

    public PetStoreServiceImplTest() {
        super("spring.xml");
    }

    @Test
    public void testSavePetInfo() throws Exception {
        PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) getBean("petStore");
        petStoreService.savePetInfo("Lulu", "198925", "pet");
    }
}