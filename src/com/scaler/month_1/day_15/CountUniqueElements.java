package com.scaler.month_1.day_15;

import com.scaler.month_1.day_10.InsertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int countUniqueElements=0;
        arrayList = getInputs();

        HashMap<Integer, Integer> hs1 = new HashMap<>();
        hs1 = getUniqueElements(arrayList);

        for (Integer x: hs1.values()) {
            if (x==1) {
                countUniqueElements++;
            }
        }

        System.out.println(countUniqueElements);
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

    public static HashMap<Integer, Integer> getUniqueElements(ArrayList arrayList){
        HashMap<Integer, Integer> hs1 = new HashMap<>();

        for (int i=0; i<arrayList.size(); i++){
            if(hs1.containsKey(arrayList.get(i))) {
                hs1.replace((Integer) arrayList.get(i), hs1.get(arrayList.get(i)) + 1);
            }else {
                hs1.put((Integer) arrayList.get(i),1);
            }
        }

        return hs1;
    }
}
