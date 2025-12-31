package com.scaler.month_1.day_13;

public class DiverseOccurence {
    public static void main(String[] args) {
        String string = "Kuldeep123";
        int type1=0, type2=0;

        for(int i=0; i<string.length(); i++){
            if ((string.charAt(i)>'A' && string.charAt(i)<'Z') ||
                    (string.charAt(i)>'a' && string.charAt(i)<'z')){
                type1++;
            }
            if ((string.charAt(i)>'0' && string.charAt(i)<'9')){
                type2++;
            }

        }
        if (type1>type2){
            System.out.println(type1);
        }else {
            System.out.println(type2);
        }
    }
}
