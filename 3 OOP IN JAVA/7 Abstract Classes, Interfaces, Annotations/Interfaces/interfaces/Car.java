
package com.interfaces;

public class Car implements Engine , Brake {

    @Override
    public void start(){
        System.out.println("Engine is srarting");
    } 

    @Override
    public void stop(){
        System.out.println("Engine has stopped");
    }

    @Override
    public void acceleration(){
        System.out.println("Engine of car is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("Brake is applied");
    }

    
}




