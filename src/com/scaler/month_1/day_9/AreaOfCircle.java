package com.scaler.month_1.day_9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static double circleArea(int radius){
        double area;
        area = 3.1416*radius*radius;
        double roundedArea = Math.round(area*100.0)/100.0;
        return roundedArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        System.out.println(circleArea(radius));
    }
}
