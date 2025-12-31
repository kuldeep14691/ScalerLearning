package com.scaler.month_1.day_11;

import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];

        for (int rows=0;rows<row;row++){
            for (int columns=0;columns<column;column++){
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        for (int rows=0;rows<row;row++){
            for (int columns=0;columns<column;columns++){
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }

        int rowSum=0;
        for (int rows=0;rows<row;row++){
            for (int columns=0;columns<column;columns++){
                rowSum += matrix[rows][columns];
            }
            System.out.println(rowSum + " ");
            rowSum = 0;
        }
    }
}
