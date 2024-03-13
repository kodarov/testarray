package ru.kodarovs.testarray;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> countMap = ArrayToMap.convertToMapCountEl(array);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", count: " + entry.getValue());
        }
    }
}
