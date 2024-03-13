package ru.kodarovs.testarray;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static Map<Integer, Integer> convertToMapCountEl(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : array) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }
        return countMap;
    }
}
