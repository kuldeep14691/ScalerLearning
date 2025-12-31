package com.scaler.month_1.day_11;

import java.util.Scanner;

public class MatrixWavePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixDimension = scanner.nextInt();
        int[][] matrix = new int[matrixDimension][matrixDimension];

        for (int rows=0;rows<matrixDimension;rows++){
            for (int columns=0;columns<matrixDimension;columns++){
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        for (int rows=0;rows<matrixDimension;rows++){
            for (int columns=0;columns<matrixDimension;columns++){
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }


        for (int columns=0;columns<matrixDimension;columns++){
            if (columns%2==0){
                for (int rows=0;rows<matrixDimension;rows++){
                    System.out.print(matrix[rows][columns] + " ");
                }
            }else {
                for (int rows=matrixDimension-1;rows>=0;rows--){
                    System.out.print(matrix[rows][columns] + " ");
                }

            }

        }
    }
}
