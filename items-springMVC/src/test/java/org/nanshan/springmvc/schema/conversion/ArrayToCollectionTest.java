package org.nanshan.springmvc.schema.conversion;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.ArrayList;
import java.util.List;

public class ArrayToCollectionTest {

    @Test
    public void testConvert() throws Exception {
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new ArrayToCollection());
        List<String> list = new ArrayList<>();
        list.add("alien");
        list.add("star");
        list.add("year");
        List result = conversionService.convert(list, List.class);
        Assert.assertEquals(3, result.size());
    }
}