package com.scaler.month_1.revision;

import java.util.ArrayList;

public class ArrayList2D1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList2d = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arrayList1d = new ArrayList<>();
        arrayList1d.add(0,10);
        arrayList1d.add(1,11);
        arrayList1d.add(2,12);

        arrayList2d.add(0,arrayList1d);
        System.out.println(arrayList2d);

        arrayList1d.clear();
        arrayList1d.add(0,20);
        arrayList1d.add(1,21);
        arrayList1d.add(2,22);

        arrayList2d.add(1, arrayList1d);

        System.out.println(arrayList2d);
    }
}
