package com.scaler.month_1.day_11;

import java.util.Scanner;

public class PrintMatrixByRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        for(int rowindex=0; rowindex<rows;rowindex++){
            for (int columnindex=0;columnindex<columns;columnindex++){
                matrix[rowindex][columnindex] = sc.nextInt();
            }
        }


        for(int rowindex=0; rowindex<rows;rowindex++){
            for (int columnindex=0;columnindex<columns;columnindex++){
                System.out.print(matrix[rowindex][columnindex] + " ");
            }
            System.out.println();
        }


    }
}
