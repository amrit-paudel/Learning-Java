


package com.interfaces;


public class Carmedia implements Media{
    @Override
    public void start(){
        System.out.println("Media player is starting");
    }

    @Override
    public void stop(){
        System.out.println("Media player has stopped");
    }

}
