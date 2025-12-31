package ClassPracticeAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class PairStringProblem {
    public static void main(String[] args) {
        System.out.println("Enter string to evaluate: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        char[] arrays = inputString.toCharArray();
        System.out.println(arrays);

        for (int i=0; i< arrays.length; i++){
            for (int j=i; j<arrays.length; j++){
                if (i<j && arrays[i] == 'a' && arrays[j] == 'g'){
                    System.out.println("Pair found: " + i +"," + j);
                }
            }
        }


    }
}
