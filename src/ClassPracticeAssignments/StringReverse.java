package ClassPracticeAssignments;

public class StringReverse {
    public static void main(String[] args) {
        String A = new String("The sky is blue");
        String result = new String();
        char[] chars = A.toCharArray();

        //reverse entire A
        reverse(chars,0,chars.length-1);

        System.out.println(result.toString());

        //reverse each word again
        int start=0;
        for (int i = 0; i < chars.length; i++) {
            if (i==chars.length-1){
                reverse(chars,start, i);
                start = i+1;
            } else if (chars[i] == ' ') {
                reverse(chars,start, i-1);
                start = i+1;
            }
        }
        result = String.copyValueOf(chars);
        System.out.println(result.toString());

    }
    public static void reverse(char[] arr, int left, int right){
        while (left<right){
            char temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}
