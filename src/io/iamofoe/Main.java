package io.iamofoe;

import io.iamofoe.Algorithm.BinarySearch;
import io.iamofoe.List.ArrayList;
import io.iamofoe.List.LinkedList;
import io.iamofoe.List.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(25);
        list.add(45);

        System.err.println(BinarySearch.search(list, 25));

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(20);
//        linkedList.add(28);
//        linkedList.set(1, 29);
//        System.err.println(linkedList.size());

    }
}
