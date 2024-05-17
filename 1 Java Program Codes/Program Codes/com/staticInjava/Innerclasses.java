


package com.staticInjava;


public class Innerclasses { 

    static class Temp{
        int num1;
        int num2;
        int num3;

        Temp( int num1, int num2, int num3 ){
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }
    }

    public static void main(String[] args) {

        Temp temp1 = new Temp(10,20,30);
        System.out.println(temp1.num1);
     
    }
    
}



