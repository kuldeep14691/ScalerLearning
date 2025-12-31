package com.scaler.month_1.ScalerDSAFundamentals;

import java.util.ArrayList;

public class ArrayListPractice_2 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add(0,"Kuldeep");
        stringArrayList.add(0,"Kuldeep2");
        System.out.println(stringArrayList.contains("Kuldeep"));
        System.out.println(stringArrayList.indexOf("Kuldeep"));
//        System.out.println(stringArrayList.);

        System.out.println(stringArrayList.toString());

    }
}
