

package com.staticInjava;

public class StaticVariablesInitializing {

    static int num;
    static String name;

    static{
        System.out.println("inside the static block");
        num = 100;
        name = "Amrit poudel";
    }

    public static void main(String[] args) {
        System.out.println(StaticVariablesInitializing.num);
        System.out.println(StaticVariablesInitializing.name);
    }

    
}
