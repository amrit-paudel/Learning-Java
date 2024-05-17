

package com.Generics;


//In generic code, the question mark (?)
// is called the wildcard, represents an unknown type


public class Main {
    public static void main(String[] args) {
        GenericArrayList <Number> list = new GenericArrayList<>();
        list.add(10.2f);
        list.add(20.3f);
        list.add(30.4f);

        System.out.println( GenericArrayList.sumOfItems(list) );


/* 
        GenericArrayList <String> list1 = new GenericArrayList<>();
        list1.add("Amrit");
        list1.add("Aashish");

        System.out.println(list1);*/
    } 
}


