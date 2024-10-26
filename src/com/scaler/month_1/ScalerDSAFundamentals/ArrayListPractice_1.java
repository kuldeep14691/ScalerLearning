package com.scaler.month_1.ScalerDSAFundamentals;

import java.util.*;
import java.util.Scanner;

public class ArrayListPractice_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        //defining
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        //adding elements
        integerArrayList.add(10);
        integerArrayList.add(13);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(30);
        integerArrayList.add(50);
        integerArrayList.add(61);
        integerArrayList.add(62);
        integerArrayList.add(63);
        integerArrayList.add(65);

        //printing
        System.out.println(integerArrayList);


        //adding at specific index
        integerArrayList.add(0,90);
        System.out.println(integerArrayList);

        //fetching specific index
        System.out.println(integerArrayList.get(0));

        //updating specific index
        integerArrayList.set(0,100);
        System.out.println(integerArrayList);

        //getting size of array list
        System.out.println(integerArrayList.size());

        //removing all odd numbers from list
//        int i=0;
//        for (i=0;i<integerArrayList.size();i++){
//            if (integerArrayList.get(i)%2!=0){
//                integerArrayList.remove(i);
//            }
//        }
//        System.out.println(integerArrayList);


        //remove prime numbers
//        System.out.println("About to remove prime numbers");
//        int count=0;
//        boolean isPrime=true;
//        for (count=0;count<integerArrayList.size();count++){
//            //check if element is prime
//            for (int x=2;x<integerArrayList.get(count);x++){
//                if(integerArrayList.get(count)%x==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                integerArrayList.remove(count);
//                count--;
//            }
//            isPrime = true;
//        }
//        System.out.println(integerArrayList);


//        int index = 0;
//        String s, rs;
//        s = "Hello World";
//        char[] c1, c2 = new char[s.length()];
//        c1 = s.toCharArray();
//
//        for (int i=s.length()-1;i>=0;i--){
//            c2[index] = c1[i];
//            index++;
//        }
//        s = c2.toString();
//        System.out.println(c2);


        //printing vowels in string in reverse order
//        int index = 0;
//        String s, rs;
//        s = "Hello World";
//        char[] c1, c2 = new char[s.length()];
//        c1 = s.toCharArray();
//
//        for (int i=s.length()-1;i>=0;i--){
//            if(c1[i]=='a' || c1[i]=='e' || c1[i]=='i' || c1[i]=='o' || c1[i]=='u'
//                    || c1[i]=='A' || c1[i]=='E' ||c1[i]=='I' || c1[i]=='O' ||c1[i]=='U'){
//                c2[index] = c1[i];
//                index++;
//            }
//        }
//        System.out.println(c2);


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lengthOfSubstring = sc.nextInt();
        sc.close();

        int count;
        Character oldChar = ' ', newChar=' ';

        String tempString = new String();
        boolean addCharToResultString = false;
        char[] charArr = s.toCharArray();

        for (count=0; count<s.length(); count++){
            newChar = charArr[count];

            for (int count2=count+1; (count2<count+lengthOfSubstring) && count2<=charArr.length-1;count2++){
                if (charArr[count2]!=newChar){
                    addCharToResultString = true;
                }
            }

            if(addCharToResultString){
                addCharToResultString = false;
                tempString = tempString+newChar;
            } else {
                count += lengthOfSubstring-1;
            }
        }

//        int substringLength=0;
//
//        for (count=0; count<s.length(); count++){
//            newChar = charArr[count];
//
//            if (oldChar == newChar){
//                occurenceOfChar++;
//            } else {
//                if(occurenceOfChar>lengthOfSubstring){
//                    substringLength = occurenceOfChar;
//                }
//
//                substringLength = occurenceOfChar;
//                occurenceOfChar = 1;
//                oldChar = newChar;
//            }
//
//            if(occurenceOfChar==1){
//                tempString = tempString+oldChar;
//            }
//        }


        System.out.println(tempString);
    }

}
