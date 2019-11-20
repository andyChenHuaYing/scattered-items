package org.oscar.springmvc.schema.conversion;


import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/22.
 * Version 1.0-SNAPSHOT
 */
public class ArrayToCollection implements Converter<List<String>, Set<String>> {

    @Override
    public Set<String> convert(List<String> source) {
        return new HashSet<>(source);
    }
}
