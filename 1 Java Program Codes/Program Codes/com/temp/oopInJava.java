package com.temp;
//import java.util.Arrays;

public class oopInJava {
    public static void main(String[] args) {

        Number number1 = new Number(10,20);
        Number number2 = new Number(30,40);
        Number number3 = new Number(50,60);
        Number number4 = new Number(70,80);


        System.out.println(number1.num1);
        System.out.println(number2.num1);
        System.out.println(number3.num1);
        System.out.println(number4.num1);
        
        System.out.println(Number.num3); // 100

        // number1.num3 = 500;
        Number.num3 = 600;

        System.out.println(Number.num3);  // 500

    }
}


class Number{
    int num1;
    int num2;
    static int num3;

    static{
        num3 = 100;
    }

    Number( int num1, int num2 ){
        this.num1 = num1;
        this.num2 = num2;
    }
};