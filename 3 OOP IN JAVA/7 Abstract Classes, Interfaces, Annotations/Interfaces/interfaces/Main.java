

package com.interfaces;

public class Main {

    public static void main(String[] args) {
        
        // Car car = new Car();
        // Carmedia carMedia = new Carmedia();

        CompleteCar completeCar = new CompleteCar( new Car(), new Carmedia() );

        completeCar.startCar();
        completeCar.startMedia();

        // Is it a good practice to pass objects to a constructor ?
        // Or does above way of making object a bad one
    }
    
}
