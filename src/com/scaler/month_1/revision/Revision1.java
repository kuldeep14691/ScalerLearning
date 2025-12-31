package com.scaler.month_1.revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Revision1 {
    public static void main(String[] args) {
//        int count=0;

//        int[][] arr = new int[5][2];
//        for (int i=0;i<5;i++){
//            for(int j=0; j<2;j++){
//                arr[i][j] = count;
//                count++;
//            }
//        }
//
//        for (int i=0;i<5;i++){
//            for(int j=0; j<2;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        ArrayList<Integer> arrayList = takeInput(numberOfInputs, scanner);
        System.out.println(arrayList);

        ArrayList<Integer> multiplesArrayList = doMultiples(arrayList);
        System.out.println(multiplesArrayList);


    }

    public static ArrayList<Integer> takeInput(int numberOfInputs, Scanner scanner){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<numberOfInputs; i++){
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

    public static ArrayList<Integer> doMultiples(ArrayList<Integer> inputArrayList){
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        for (int i=0; i< inputArrayList.size(); i++){
            if(inputArrayList.get(i)%5==0 || inputArrayList.get(i)%7==0){
                resultArrayList.add(inputArrayList.get(i));
            }
        }

        return resultArrayList;
    }
}
