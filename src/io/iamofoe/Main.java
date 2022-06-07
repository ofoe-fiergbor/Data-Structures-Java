package io.iamofoe;

import io.iamofoe.List.ArrayList;
import io.iamofoe.List.List;
import io.iamofoe.List.singleLinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(25);
//        list.add(25);
//        list.add(45);
//
//        System.err.println(list);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.add(28);
        linkedList.set(1, 29);
        System.err.println(linkedList.size());

    }
}
