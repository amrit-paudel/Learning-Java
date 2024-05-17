



package com.Inheritance;

public class Main {
    public static void main(String[] args) {

        Shapes circle = new Circle();
        System.out.println(circle.toString());

        Circle.display(); // accessing the static method via child class name
        Triangle.display(); // accessing the static method via child class name

    }
}

class Shapes{
    int temp;

    Shapes(){
        this.temp = 100;
    }
    
    void area(){
        System.out.println("Inside the shapes class");
    }
    
    // static method defined in the parent class
    static void display(){
        System.out.println("Inside Shapes class");
    }
}

class Circle extends Shapes {
    int temp;

    Circle(){
        this.temp = 200;
    }
    @Override
    void area(){
        System.out.println("Area of circle : pi *r *r");
    }
}

class Triangle extends Shapes{

    @Override
    void area(){
        System.out.println("Area of triangle : 1/2 * b*h");
    }
}















class Cars{
    String name;
    String price;
    String modelNo;

    Cars( String name, String price, String modelNo ){
        this.name = name;
        this.price = price;
        this.modelNo = modelNo;
    }

    Cars( Cars car ){
        this.name = car.name;
        this.price = car.price;
        this.modelNo = car.modelNo;
    }

    Cars(){
        this.name = null;
        this.price = null;
        this.modelNo = null;
    }

    Cars( String name ){
        this.name = name;
        this.price  = null;
        this.modelNo = null;
    }
}











