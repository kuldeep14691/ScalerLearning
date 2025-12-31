package ClassPracticeAssignments;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        System.out.println("Enter array elements: ");
        int[] a = new int[size];
        for (int i=0; i<size; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length-1; j++) {
                if (a[j] < a[i]) {
                    swap(a,i,j);
                }
            }
        }
        for (int k = 0; k < a.length-1; k++) {
            System.out.println(a[k]);
        }


    }
     static void swap(int[] a, int fromIndex, int toIndex){
        int temp = a[fromIndex];
        a[fromIndex] = a[toIndex];
        a[toIndex] = temp;
    }
}
