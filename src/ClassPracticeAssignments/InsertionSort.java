package ClassPracticeAssignments;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        System.out.println("Enter array elements: ");
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i < a.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (a[j] > 0 && a[j-1] > a[j]) {
//                    swap(a, j-1, j);
//                }
//            }
            int j=i;
            while(j>0 && a[j-1] > a[j]){
                swap(a,j-1, j);
                j--;
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

//        System.out.println(a.length);
    }


    static void swap(int[] a, int fromIndex, int toIndex) {
        int temp = a[fromIndex];
        a[fromIndex] = a[toIndex];
        a[toIndex] = temp;
    }
}
