package io.iamofoe.Algorithm;

import io.iamofoe.List.List;

public class BinarySearch {
    public static int search(List<Integer> array, int target) {
        int lowerBound = 0;
        int upperBound = array.size() - 1;

        while (lowerBound < upperBound) {
            int midPoint = (upperBound + lowerBound) / 2;

            if (array.get(midPoint) == target) {
                return midPoint;
            }
            if (array.get(midPoint) > target) {
                upperBound = midPoint - 1;
            } else lowerBound = midPoint + 1;
        }
        return 0;
    }
}
