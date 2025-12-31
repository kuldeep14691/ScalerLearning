package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<5; i++){
            arrayList.add(i+1);
        }
        System.out.println(arrayList);
        ArrayList<Integer> frequencyList = solve(arrayList);
        System.out.println(frequencyList);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int frequency=0;
        ArrayList<Integer> frequencyList = new ArrayList<>();


        for (int i=0; i<A.size(); i++){
            //frequency =
            for (int element: A) {
                if (element==A.get(i)){
                    frequency++;
                }
            }
            frequencyList.add(frequency);
            frequency = 0;

        }
        return frequencyList;
    }
}
