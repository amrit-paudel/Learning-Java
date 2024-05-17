

package com.interfaces.interfaces1;

public class CarEngine implements Engine {

    @Override
    public void start(){
        System.out.println("Car engine has started");
    }

    @Override
    public void stop(){
        System.out.println("Car engine has stopped");
    }

    @Override
    public void acceleration(){
        System.out.println("Car engine has accelerated");
    }
}
