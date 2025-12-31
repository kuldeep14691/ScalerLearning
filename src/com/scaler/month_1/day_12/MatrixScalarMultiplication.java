package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class MatrixScalarMultiplication {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        int B=3;

        for(int i=0; i < A.size(); i++) {
            resultList.add(new ArrayList());
        }

        for (int row=0; row<A.size(); row++){
           for (int column=0; column<A.get(0).size(); column++){
               resultList.get(row).set(column, A.get(row).get(column)*B);
           }
        }
        System.out.println(resultList.toString());

    }
}
