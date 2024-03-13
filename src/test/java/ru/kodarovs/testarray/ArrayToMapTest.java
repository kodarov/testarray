package ru.kodarovs.testarray;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayToMapTest {

    @Test
    public void wheNonEmptyArrayThenReturnCorrectMap() {
        int[] array = {3, 3, 2, 3, 2, 1};
        Map<Integer, Integer> expectedResult = Map.of(1, 1, 2, 2, 3, 3);
        Map<Integer, Integer> result = ArrayToMap.convertToMapCountEl(array);
        assertThat(result).isNotNull()
                .hasSize(3)
                .containsAllEntriesOf(expectedResult);
    }

    @Test
    public void whenEmptyArray_thenReturnEmptyMap() {
        int[] array = {};
        Map<Integer, Integer> result = ArrayToMap.convertToMapCountEl(array);
        assertThat(result).isEmpty();
    }

    @Test
    public void whenSingleElementArrayThenReturnMapWithSingleEntry() {
        int[] array = {1};
        Map<Integer, Integer> expectedResult = Map.of(1, 1);
        Map<Integer, Integer> result = ArrayToMap.convertToMapCountEl(array);
        assertThat(result).isNotNull()
                .hasSize(1)
                .containsAllEntriesOf(expectedResult);
    }
}