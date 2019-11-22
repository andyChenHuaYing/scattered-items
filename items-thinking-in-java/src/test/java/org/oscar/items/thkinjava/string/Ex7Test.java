package org.oscar.items.thkinjava.string;

import junit.framework.Assert;
import org.oscar.items.thkinjava.string.Exercises.Ex7;
import org.junit.Test;

public class Ex7Test {
    private Ex7 ex7 = new Ex7();

    @Test
    public void testRegularTest() throws Exception {
        String input = "Andy is the best java programmer !";
        String input2 = "Andy is the best java programmer.";
        String input3 = "andy is the best java programmer.";
        String input4 = "andy is the best java programmer!";
        Assert.assertEquals(false, ex7.regularTest(input));
        Assert.assertEquals(true, ex7.regularTest(input2));
        Assert.assertEquals(false, ex7.regularTest(input3));
        Assert.assertEquals(false, ex7.regularTest(input4));
    }
}