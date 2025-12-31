package com.scaler.month_1.day_13;

import java.util.ArrayList;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        ArrayList<String> inputString = new ArrayList<>();

        for(int i=0; i<numberOfTestCases; i++){
            inputString.add(scanner.next());
            System.out.println(inputString.get(i).length());
        }
    }
}
