package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(2, 0);
//        arrayList.set(2,30);
//        System.out.println(arrayList);


        ArrayList<ArrayList> arrayList = new ArrayList<ArrayList>();
        arrayList.add(new ArrayList<>());
        arrayList.add(new ArrayList<>());
        arrayList.get(0).add(1);
        if (arrayList.get(0).equals(arrayList.get(1))){
            System.out.println("equals worked");
        }
        arrayList.get(0).add(2);
        System.out.println(arrayList);

        arrayList.get(0).add(3);
        System.out.println(arrayList);

        arrayList.get(1).add(3);
        System.out.println(arrayList);

        arrayList.get(1).add(4);
        System.out.println(arrayList);


        //copying one element array list to another
        arrayList.add(new ArrayList<>());
        arrayList.get(2).add(arrayList.get(1));
        System.out.println(arrayList);

        arrayList.get(2).add(arrayList.get(0));
        System.out.println(arrayList);


        //getting size of 2D arrayList - row & column
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1).size());


//        Integer numberOfRows = 5;
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i=0;i<numberOfRows; i++){
//            ArrayList<Integer> row = new ArrayList<>();
//            for (int j=0;j<=i;j++){
//                row.add(j);
//            }
//            graph.add(row);
//        }
//        System.out.println(graph);
    }
}
