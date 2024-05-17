

package com.interfaces.interfaces1;

public class CarMedia implements Media {
    
    @Override
    public void start(){
        System.out.println("Media player has started");
    }

    @Override
    public void stop(){
        System.out.println("Media has stopped");
    }
}


