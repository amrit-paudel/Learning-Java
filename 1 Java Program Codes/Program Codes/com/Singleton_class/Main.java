package com.Singleton_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello inside the Main class");

        Singleton temp = Singleton.getObject("Singleton class object");
        System.out.println(temp.info);

        // Singleton temp1 = Singleton.getObject("Singleton class object");
        // Singleton temp2 = Singleton.getObject("Singleton class object");
        Singleton temp3 = Singleton.getObject("Singleton class object");

        System.out.println(temp3.info);
    }
}
