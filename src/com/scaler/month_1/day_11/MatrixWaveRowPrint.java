package com.scaler.month_1.day_11;

import java.util.Scanner;

public class MatrixWaveRowPrint {
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


        for (int rows=0;rows<matrixDimension;rows++){
            if (rows%2==0){
                for (int columns=0;columns<matrixDimension;columns++){
                    System.out.print(matrix[rows][columns] + " ");
                }
            }else {
                for (int columns=matrixDimension-1;columns>=0;columns--){
                    System.out.print(matrix[rows][columns] + " ");
                }

            }

        }
    }
}
