

package com.interfaces;

public class Main {

    public static void main(String[] args) {

      System.out.println(Main.isOdd(3));
    }

    static boolean isOdd(int num){
        return (num & 1) == 1;
    }
    
}
