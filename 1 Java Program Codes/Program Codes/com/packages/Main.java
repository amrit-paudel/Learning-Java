

package com.packages;

public class Main{
    public static void main(String[] args) {

        A obj1 = new A(10);

        System.out.println( obj1 instanceof A ); 

        
    }
}  


// Just a random class

class B{

    int numB;

    B(){
        this.numB = -1;
    }

    B(int numB){
        this.numB = numB;
    }
}

class A extends B {
    int numA;

    A( int numA ){
        this.numA = numA;
    }

    A(){
        this.numA = -1;
    }
}

