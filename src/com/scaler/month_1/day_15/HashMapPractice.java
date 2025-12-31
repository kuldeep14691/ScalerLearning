package com.scaler.month_1.day_15;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println(hashMap);

        System.out.println("Now, Adding elements to hash map");
        hashMap.put(1,"Pune");
        hashMap.put(2,"Mumbai");
        hashMap.put(3,"Bangalore");
        hashMap.put(4,"Ooty");
        hashMap.put(5,"Delhi");


        System.out.println("Now, printing hash map");
        System.out.println(hashMap);


        System.out.println("Using hashmap.get");
        System.out.println(hashMap.get(1));

        System.out.println("using hashmap.containsKey");
        System.out.println(hashMap.containsKey(2));


        System.out.println("Using hashmap.replace");
        hashMap.replace(2,"Chennai");
        System.out.println(hashMap);


        System.out.println("using hashmap.remove");
        hashMap.remove(2);
        System.out.println(hashMap);


        System.out.println("**Comment: Now, printing by keys");
        for (Integer i :hashMap.keySet()) {
            System.out.println("Key: " + i + " Value: " + hashMap.get(i));
        }


        System.out.println("**Comment: Now, printing values");
        for (String string: hashMap.values()) {
            System.out.println(string);
        }


        System.out.println("**Comment: Now, trying entryset");
        for (Map.Entry<Integer, String> hashMap1: hashMap.entrySet()) {
            System.out.println(hashMap1);

        }


        System.out.println("**Comment: Adding hashMap values to Hashset");
        HashSet<String> hashSet = new HashSet<>();
        for (Integer i: hashMap.keySet()) {
            hashSet.add(hashMap.get(i));
        }
        System.out.println(hashSet);


        System.out.println("**Comment: Adding hashMap keys to Hashset");
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (Integer i: hashMap.keySet()) {
            hashSet1.add(i);
        }
        System.out.println(hashSet1);
    }
}
