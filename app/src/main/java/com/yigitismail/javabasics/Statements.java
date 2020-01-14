package com.yigitismail.javabasics;

public class Statements {

    public static void main(String[] args){
        /*
        int x = 5;
        int y = 5;
        int z = 10;

        System.out.println((x<y) || (x>y));

        if (x > y){
            System.out.println("x büyüktür y den");
        } else if (x < y){
            System.out.println("x küçüktür y den");
        } else {
            System.out.println("x eşittir y");
        }
        */

        int day = 9;
        String dayString = "";

        switch (day){

            case 1:
                dayString = "Pazartesi";
                break;

            case 2:
                dayString = "Salı";
                break;

            case 3:
                dayString ="Çarşamba";
                break;

            case 4:
                dayString = "Perşembe";
                break;

            case 5:
                dayString ="Cuma";
                break;

            case 6:
                dayString = "Cumartesi";
                break;

            default:
                dayString = "Sunday";
                break;

        }

        System.out.println(dayString);


    }

}
