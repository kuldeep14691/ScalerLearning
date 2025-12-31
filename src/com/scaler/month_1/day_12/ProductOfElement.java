package com.scaler.month_1.day_12;

import java.util.ArrayList;

public class ProductOfElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<5; i++){
            arrayList.add(i+1);
        }
        long product = solve(arrayList);
        System.out.println(product);
    }

    public static long solve(ArrayList<Integer> arrayList){
        long product=1;

        for (int i=0; i<arrayList.size(); i++){
            product *= arrayList.get(i);

        }
        return product;
    }
}
