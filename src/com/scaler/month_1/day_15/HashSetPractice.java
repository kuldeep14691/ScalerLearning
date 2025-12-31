package com.scaler.month_1.day_15;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        //You are given an array A of N integers.
        // Return the count of elements with frequncy 1 in the given array.
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Now, Trying add on Hash set");
        hashSet.add(10);
        hashSet.add(9);
        hashSet.add(8);
        hashSet.add(7);
        hashSet.add(20);

        System.out.println("Now, Trying print on Hash set");
        System.out.println(hashSet);
        System.out.println(hashSet.getClass());

        System.out.println("Now, Trying size on Hash set");
        System.out.println(hashSet.size());

        hashSet.remove(10);
        System.out.println(hashSet);
        System.out.println(hashSet.size());

        System.out.println("Now, Trying contains on Hash set");
        System.out.println(hashSet.contains(20));

//        HashSet<Integer> hashSet1 = new HashSet<>();
        System.out.println("Now, Trying Clone on Hash set");
        Object hashSet1 = hashSet.clone();
        System.out.println(hashSet1);

        System.out.println("Now, Trying Iterator on Hash set");
        for (Integer i: hashSet) {
            System.out.println(i);
        }


        System.out.println("Now, trying iterator on cloned has set");
//        for (Integer i: hashSet1) {
//            System.out.println(i);
//        }
        HashSet<Integer> hashSet2 = (HashSet<Integer>) hashSet1;
        System.out.println(hashSet2);


        System.out.println("Now, trying iterator on cloned hash set");
        for (Integer i: hashSet2) {
            System.out.println(i);
        }
        }
    }
