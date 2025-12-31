package com.scaler.month_1.day_15;

import java.util.HashSet;

public class HashSetIntersection {
    public static HashSet<Integer> getIntersection(HashSet<Integer> hs1, HashSet<Integer> hs2){
        HashSet<Integer> intersection_hs = new HashSet<>();
        for (Integer x: hs1) {
            if (hs2.contains(x)){
                intersection_hs.add(x);
            }
        }

        return intersection_hs;
    }

    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);

        hs2.add(1);
        hs2.add(2);
        hs2.add(5);
        hs2.add(6);

        HashSet<Integer> result_hs = new HashSet<>();
        result_hs = getIntersection(hs1, hs2);
        System.out.println(result_hs);
    }
}
