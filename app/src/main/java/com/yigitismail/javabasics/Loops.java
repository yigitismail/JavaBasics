package com.yigitismail.javabasics;

public class Loops {

    public static void main(String[] args){

        int[] numbers = {23,43,65,78,59};

        for (int i = 0;i<numbers.length;i++) {

            //System.out.println(numbers[i] * 2);
        }


       for (int number : numbers){

           System.out.println(number *2 +1);
       }


    }
}
