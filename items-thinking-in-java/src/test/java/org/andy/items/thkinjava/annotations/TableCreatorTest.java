package org.andy.items.thkinjava.annotations;

import org.junit.Test;

public class TableCreatorTest {
    @Test
    public void testCreateTable() throws Exception {
        TableCreator.createTable(Member.class);

    }
}