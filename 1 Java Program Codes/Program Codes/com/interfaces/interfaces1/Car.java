

package com.interfaces.interfaces1;

public class Car {

    private Engine engine;
    private Brake brake;
    private Media media;

    Car( Engine engine,Brake brake, Media media ){
        this.media = media;
        this.brake = brake;
        this.engine = engine;
    }

    public void startCar(){
        this.engine.start();
    }

    public void stopCar(){
        this.engine.stop();
    }

    public void startBrake(){
        this.brake.brake();
    }

    public void startMusic(){
        this.media.start();
    }

    public void stopMusic(){
        this.media.stop();
    }
    
}
