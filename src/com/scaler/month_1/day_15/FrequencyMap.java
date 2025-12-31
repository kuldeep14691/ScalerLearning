package com.scaler.month_1.day_15;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyMap {
    public static HashMap<Integer, Integer> getFrequency(int[] array_integer){
      HashMap<Integer, Integer> hashMap = new HashMap<>();

      for (int i=0; i<array_integer.length; i++){
        if (hashMap.containsKey(array_integer[i])){
            hashMap.replace(array_integer[i], hashMap.get(array_integer[i])+1);
        }else {
            hashMap.put(array_integer[i], 1);
        }
      }

      return  hashMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();
        int[] array_integer = new int[numberOfEntries];

        for (int i=0; i<numberOfEntries; i++){
            array_integer[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap = getFrequency(array_integer);

        System.out.println(hashMap);
    }
}
