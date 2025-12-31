package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class MainDiagnolSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        //Initialize array list row
        for (int i=0; i<5; i++) {
            arrayList.add(new ArrayList<>());
            //Initialize array list columns
//            for (int j=0; j<5; j++){
//                arrayList.get(i).add(0);
//            }
        }

        for (int i=0; i<arrayList.size(); i++){
            for (int j=0; j<5; j++){
                arrayList.get(i).add(j+1);
            }
        }

        System.out.println(arrayList);
        int diagnolSum = getDiagnolSum(arrayList);
        System.out.println(diagnolSum);
    }

    public static int getDiagnolSum(ArrayList<ArrayList<Integer>> arrayList){
        int diagnolSum=0;

        for (int i=0; i<arrayList.size(); i++){
            for (int j =0; j< arrayList.get(0).size(); j++){
                if (i==j){
                    diagnolSum += arrayList.get(i).get(j);
                }
            }
        }

        return diagnolSum;
    }
}
