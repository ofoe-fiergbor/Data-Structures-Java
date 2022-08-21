package io.iamofoe.Algorithm;

import io.iamofoe.List.List;

public class LinearSearch {
    public static int search(List<Integer> array, int target) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == target) {
                return i;
            }
        }
        return 0;
    }
}
