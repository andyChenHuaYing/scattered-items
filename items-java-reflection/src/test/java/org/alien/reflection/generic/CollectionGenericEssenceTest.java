package org.alien.reflection.generic;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionGenericEssenceTest {
    private CollectionGenericEssence collectionGenericEssence;
    @Before
    public void setUp() throws Exception {
        collectionGenericEssence = new CollectionGenericEssence();
    }

    @Test
    public void testAddElementsByMethodReflect() throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("andy");
        arrayList = collectionGenericEssence.addElementsByMethodReflect(arrayList, 10);
        /*
         * Could not iterator arrayList by for each loop.
         * for(String str : arrayList){}
         * ==============================================
         * arrayList.get(index) also will not work when the return value is not String!
         * System.out.println(arrayList.get(i));
        */


        while (arrayList.iterator().hasNext()) {
            System.out.println(arrayList.iterator().next());
        }
    }
}