package com.scaler.month_1.day_9;

import java.util.Scanner;

public class VolumeOfSphere {
    public static int sphereVolume(int radius){
        int area = 0;
        double double_area = (4*3.14159265359*radius*radius*radius)/3;
        double_area = Math.ceil(double_area);
        area = (int) double_area;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println(sphereVolume(radius));
    }
}
