

package com.staticInjava;

// import com.amrit.packages.a.Greetings;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inside the main function of main class");
        fun();

    }

    
    
    static void fun(){
        Main temp = new Main();
        temp.greeting();

    }

    void greeting(){
        System.out.println("Hello Greetings");
    }
    
}
