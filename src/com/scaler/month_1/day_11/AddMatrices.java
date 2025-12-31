package com.scaler.month_1.day_11;

import java.util.Arrays;
import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] resultMatrix = new int[row][column];

        for (int rows=0;rows<row;rows++){
            for (int columns=0;columns<column;columns++){
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        for (int rows=0;rows<row;rows++){
            for (int columns=0;columns<column;columns++){
                matrix2[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(resultMatrix));
    }
    public static int[][] solve(int[][] A, int[][] B){
        int[][] resultMatrix = new int[A.length][A[0].length];

        for (int rows=0;rows<A.length;rows++){
            for (int columns=0;columns<A[0].length;columns++){
                resultMatrix[rows][columns] = A[rows][columns] + B[rows][columns];
            }
        }
        return resultMatrix;
    }
}
