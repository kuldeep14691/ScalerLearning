package com.scaler.month_1.day_15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AddingArrayElementsToHashSet {
    public static HashSet<Integer> getHashSet(int[] input_array){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<input_array.length; i++){
            hashSet.add(input_array[i]);
        }

        return hashSet;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();
        int[] array_integer = new int[numberOfEntries];

        for (int i=0; i<numberOfEntries; i++){
            array_integer[i] = scanner.nextInt();
        }

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet = getHashSet(array_integer);

        System.out.println(hashSet);
    }
}
