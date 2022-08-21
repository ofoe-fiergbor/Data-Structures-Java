package io.iamofoe.Algorithm;

import io.iamofoe.List.ArrayList;
import io.iamofoe.List.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldReturnIndexOfFoundElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(35);
        list.add(45);

        var result = BinarySearch.search(list, 25);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnZeroForNotFindingElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(25);
        list.add(45);

        var result = BinarySearch.search(list, 65);
        assertEquals(0, result);
    }
}