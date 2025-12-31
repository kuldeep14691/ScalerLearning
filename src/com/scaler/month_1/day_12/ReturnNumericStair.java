package com.scaler.month_1.day_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnNumericStair {
    public static void main(String[] args) {
        int numberOfStairs = getInput();
        ArrayList<ArrayList<Integer>> stairPattern = new ArrayList<>();
        for (int i=0; i<numberOfStairs; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++){
                row.add(j+1);
            }
            stairPattern.add(row);
        }
        System.out.println(stairPattern);

    }

    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        int numberOfStairs = scanner.nextInt();
        return numberOfStairs;

    }
}
