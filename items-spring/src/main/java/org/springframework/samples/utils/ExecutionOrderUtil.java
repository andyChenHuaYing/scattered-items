package org.springframework.samples.utils;

import java.util.Map;
import java.util.TreeMap;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 19:53
 */
public class ExecutionOrderUtil {
    private static int order;
    private static Map<Integer, String> recordMap = new TreeMap<>();

    public static void put(String message) {
        ExecutionOrderUtil.recordMap.put(++ExecutionOrderUtil.order,
                message);
    }

    public static Map<Integer, String> getRecordMap() {
        return recordMap;
    }
}
