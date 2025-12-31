package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class MatrixTranspose {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();



    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> transposeList = new ArrayList<>();

        //Initialize Array List
        for (int i=0; i<A.get(0).size();i++){
            transposeList.add(new ArrayList<Integer>());
        }


        //Fill Transpose Array List
        for (int i=0; i<A.size(); i++){
            for (int j=0; j<A.get(0).size(); j++){
                transposeList.get(j).add(A.get(i).get(j));
            }
        }

        return transposeList;
    }
}
