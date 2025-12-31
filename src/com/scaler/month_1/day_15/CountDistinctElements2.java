package com.scaler.month_1.day_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int countUniqueElements=0;
        arrayList = getInputs();

        HashSet<Integer> hs1 = new HashSet<>();

        for (int i=0; i<arrayList.size(); i++){
            hs1.add((Integer) arrayList.get(i));
        }

        System.out.println(hs1.size());
    }


    public static ArrayList getInputs(){
        Scanner scanner = new Scanner(System.in);
        Integer numberOfElements = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<numberOfElements; i++){
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }
}
