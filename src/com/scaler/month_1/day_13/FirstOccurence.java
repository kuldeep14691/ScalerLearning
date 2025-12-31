package com.scaler.month_1.day_13;

public class FirstOccurence {
    public static void main(String[] args) {
        String s = "anagram";
        int ascii = 97;
        boolean isFound = false;
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) == ascii){
                isFound = true;
                // return 1;
            }
        }
        System.out.println(isFound);
    }
}
