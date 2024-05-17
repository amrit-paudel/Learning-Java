

package com.interfaces;

public class CompleteCar {
    
    
    private Car car;
    private Carmedia carMedia;

    
    CompleteCar( Car car, Carmedia carMedia ){
        this.car = car;
        this.carMedia = carMedia;
    }

    public void startCar(){
        this.car.start();
    }

    public void stopcar(){
        this.car.stop();
    }

    public void startMedia(){
        this.carMedia.start();
    }

    public void stopMedia(){
        this.carMedia.stop();
    }
    
}

// Here we have start( ), stop ( ) same methods in two interfaces
// But although interfaces allows multiple inheritance here we still have two same methods
// in two interfaces so on doing multiple inheritance and creating a class like this
// public class Car implements Engine, Brake, Media { }
// And Car car = new Car();
// And, car.start()
// car.stop()

// here compiler still do not know if start() is of ENgine or Media

// Such problems can be solved by creating each individual classes for each individual interfaces
// The goal of interfaces is not only to allow multiple inheritance
// Multiple inheritance just happen to be one ot many reason, there are much more use cases of interfaces
// see the bookmarked posts on stack overflow and stack exchange

// Actually it is pretty nice practice to have seperate class implementing the interface

// So see this interfaces1 folder
