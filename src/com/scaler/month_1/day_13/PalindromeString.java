package com.scaler.month_1.day_13;

public class PalindromeString {
    public static void main(String[] args) {
        String string = new String();
        string = "kuldeep";

        for (int i=0; i<string.length()/2; i++){
            if (string.charAt(i) != string.charAt(string.length()-1-i)) {
                System.out.println("Not palindrome");
            }
        }
        System.out.println("Is palindrome");
    }
}
