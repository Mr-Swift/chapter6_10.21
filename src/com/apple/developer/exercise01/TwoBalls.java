package com.apple.developer.exercise01;

import java.util.*;

@SuppressWarnings("all")
public class TwoBalls {

    public static List<List<Integer>> returnList() {
        List<List<Integer>> bigList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Set<Integer> set = new HashSet();
            List<Integer> list = new ArrayList<>();
            while (set.size() != 6) {
                set.add(new Random().nextInt(32) + 1);
            }
            for (Object obj : set) {
                list.add((Integer) obj);
            }
            list.add(new Random().nextInt(16) + 1);
            bigList.add(list);
        }
        return bigList;
    }
}
