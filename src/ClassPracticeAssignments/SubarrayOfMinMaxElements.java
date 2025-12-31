package ClassPracticeAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayOfMinMaxElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int elements = scanner.nextInt();

        System.out.println("Enter element values: ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<elements; i++){
            arrayList.add(scanner.nextInt());
        }


        //print smallest subarray containing min & max elements of array
        int min=arrayList.get(0), max=arrayList.get(0);

        for (int i=0; i< arrayList.size(); i++){
            if (arrayList.get(i) < min) min = arrayList.get(i);
            if (arrayList.get(i) > max) max = arrayList.get(i);
        }

        for (int x=0; x< arrayList.size(); x++){
            for (int y=x; y<arrayList.size(); y++){

            }
        }

    }
}
