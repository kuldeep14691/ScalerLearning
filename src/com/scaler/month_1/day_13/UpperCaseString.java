package com.scaler.month_1.day_13;

public class UpperCaseString {
    public static void main(String[] args) {
        String string = "Kuldeep", result = new String();

        for (int i=0; i<string.length(); i++){
            if ((int)string.charAt(i) >=97 && (int)string.charAt(i) <= 122 ){
                result = result + (char)((int)string.charAt(i)-32);
            } else{
                result = result + string.charAt(i);
            }
        }
        //a-z = 97-122
        //A-Z = 65-90

//        char x='a';
//        int y=0;
//
//        x= (char) (x-32);
//        System.out.println(x);

        System.out.println(result);

    }
}
