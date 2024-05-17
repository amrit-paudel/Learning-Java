


package com.access;

import com.Inheritance.Mammals;

public class Access{

    private int num;
    private String name;

    Access(){
        this.num = -1;
        this.name = null;
    }

    Access( int num, String name ){
        this.num = num;
        this.name = name;
    }

    // a getter method
    int getNum(){
        return this.num;
    }

    String getName(){
        return this.name;
    }

}

class Temp extends Mammals{

    Temp(){
        super();

    }

    Temp( int noOfEyes, int noOfLegs, boolean hasMammaryGland ){

        super( noOfEyes, noOfLegs, hasMammaryGland );


    }

    void showData(){
        System.out.println( "No of eyes : "+super.getEyes() );
        System.out.println( "No of legs : "+super.getLegs() );
    }

}

