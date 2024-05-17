


package com.random;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    Human( int age, String name, int salary, boolean married ){

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
        // this is how we initialize static variables
        // we do not use this 
        // we use the class name directly

    }

    
}
