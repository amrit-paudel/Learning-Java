

package com.object_cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        int marks[] = {10,20,30,40,50};

        Human human1 = new Human("Amrit", marks );

        Human human2 = (Human)human1.clone();
        human2.marks[0] = 500;

        System.out.println(human2);
        
    }
    
}
