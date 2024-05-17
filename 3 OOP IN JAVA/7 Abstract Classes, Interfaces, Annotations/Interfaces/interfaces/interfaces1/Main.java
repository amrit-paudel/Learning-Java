
package com.interfaces.interfaces1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car( new CarEngine(), new CarBrake(), new CarMedia() );

        car.startCar();
        car.stopCar();
        car.startBrake();
        car.startMusic();
        car.stopMusic();
    }
    
}
