


package com.Singleton_class;

public class Singleton {

    String info;

    private Singleton(String info){

        this.info = info;

    }

    static Singleton singletonInstance;

    static Singleton getObject(String info){

        if( singletonInstance == null ){
            singletonInstance = new Singleton(info);
        }
        return singletonInstance;
    }



    
}
