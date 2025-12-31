package ClassPracticeAssignments;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of elements array should contain: ");
//        int numberOfEntries = scanner.nextInt();
//        int[] array_integer = new int[numberOfEntries];
//
//        System.out.println("Enter values of elements: ");
//        for (int i=0; i<numberOfEntries; i++){
//            array_integer[i] = scanner.nextInt();
//        }
//
//        System.out.println("Arr defined/loaded. Size: " + array_integer.length);

        String A = "aBcDeFgH";
        String B = solve(A);
        System.out.println("Output: " + B.toString());
    }

    public static String solve(String A) {
        int i = 0;
        char[] chars = A.toCharArray();

        while (i<A.length()){
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);

            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
            i++;
        }
        A = String.valueOf(chars);
        return A;
    }

}
