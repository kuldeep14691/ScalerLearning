package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class CubeOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<5; i++){
            arrayList.add(i+1);
        }
        System.out.println(arrayList);
        ArrayList<Long> cubeList = solution(arrayList);
        System.out.println(cubeList);
    }

    public static ArrayList<Long> solution(ArrayList<Integer> A){
        long cube=1;
        ArrayList<Long> cubeList = new ArrayList<>();


        for (int i=0; i<A.size(); i++){
            cube = (long)A.get(i)*(long)A.get(i)*(long)A.get(i);
            cubeList.add(cube);

        }
        return cubeList;
    }
}
