

package com.Inheritance;

public class Cow extends Mammals {

    String name;
    int noOfMammaryGlands;

    Cow( String name, int noOfMammaryGlands, int noOfEyes, int noOfLegs, boolean hasMammaryGland ){

        super( noOfLegs, noOfEyes, hasMammaryGland );
        this.name = name;
        this.noOfMammaryGlands = noOfMammaryGlands;

        System.out.println( "Eyes : "+super.getEyes() );
        System.out.println( "Legs : "+super.getLegs() );
    }

    void showDetails(){
        System.out.println(" Name : "+this.name);
        System.out.println(" Eyeys : "+super.getEyes());
        System.out.println(" Legs : "+super.getLegs());
        System.out.println(" Mammary glands : "+noOfMammaryGlands);
    }
}
