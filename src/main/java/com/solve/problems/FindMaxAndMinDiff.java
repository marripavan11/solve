package com.solve.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMinDiff {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(91);
        list.add(10);
        list.add(20);

        List<Integer> newList = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            for (Integer aList : list) {
                if (list.get(i).intValue() != aList.intValue()) {
                    newList.add(list.get(i) - aList);
                }
            }
        }

        System.out.println(Collections.max(newList));
        System.out.println(Collections.min(newList));
    }
}
