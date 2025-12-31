package ClassPracticeAssignments;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String A = new String("xbaaaabaaa");
        String B = longestPalindrome(A);
        System.out.println(B.toString());
    }

    public static String longestPalindrome(String A){
        int ans = 1, start =0, end=0;
        char[] chars = A.toCharArray();

        for (int i=0; i<chars.length; i++){
            for (int j=i+1; j<chars.length; j++){
                if (isPandrome(chars,i,j) && ans < (j-i+1)){
                    ans = j-i+1;
                    start = i;
                    end = j;
                }
            }
        }
        String result = String.copyValueOf(chars,start,end-start+1);

        return result;
    }

    public static boolean isPandrome(char[] A, int start, int end){
        int i=start, j=end;

        while(i < j){
            if (A[i] != A[j]){
                return false;
            }
            i++; j--;

        }
        return true;
    }
}
