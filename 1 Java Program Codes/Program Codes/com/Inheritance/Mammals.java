

package com.Inheritance;

public class Mammals {
    private int noOfLegs;
    private int noOfEyes;
    private boolean hasMammaryGland;
    
    // a default constructor
    protected Mammals(){
        this.noOfEyes = -1;
        this.noOfLegs = -1;
    }

    // a copy constructor
    // this is called when we receive an object instead of datas
    protected Mammals( Mammals obj ){
        this.noOfEyes = obj.noOfEyes;
        this.noOfLegs = obj.noOfLegs;
        this.hasMammaryGland = obj.hasMammaryGland;

    }

    // a parameterized constructor
    protected Mammals( int noOfEyes, int noOfLegs, boolean hasMammaryGland ){
        this.noOfEyes = noOfEyes;
        this.noOfLegs = noOfLegs;
        this.hasMammaryGland = hasMammaryGland;
    }

    // getters
    protected int getEyes(){
        return this.noOfEyes;
    }

    protected int getLegs(){
        return this.noOfLegs;
    }
}
