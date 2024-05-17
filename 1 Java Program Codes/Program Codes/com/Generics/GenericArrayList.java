
package com.Generics;

import java.util.Arrays;


public class GenericArrayList < T extends Number > {



    // first of all writing all the required variables
    private Object arrayData[];
    private int arrayDataSize;
    private static int DEFAULT_SIZE = 10;

    // now writing all the required methods

    // First of all constructor
    GenericArrayList() {
        this.arrayDataSize = 0;
        this.arrayData = new Object[DEFAULT_SIZE];
    }

    // method to add data
    public void add(T data) {
        if (this.isFull()) {
            this.resize();
        }
        this.arrayData[this.arrayDataSize++] = data;
    }

    // to check of the array is full or not
    private boolean isFull() {
        return this.arrayDataSize == this.arrayData.length;
    }

    // to resize the array
    private void resize() {
        Object tempArray[] = new Object[this.arrayData.length * 2];

        for (int i = 0; i <= this.arrayData.length - 1; i++) {
            tempArray[i] = this.arrayData[i];
        }

        this.arrayData = tempArray;
    }

    // to remove an item
    public void remove() {
        --this.arrayDataSize;
    }

    // to set item in an index
    public void set(T item, int index) {
        if (index <= this.arrayData.length - 1) {
            this.arrayData[index] = item;
        }
        this.add(item);
    }

    // display method
    public void display() {

        for (int i = 0; i <= this.arrayDataSize - 1; i++) {
            System.out.println(this.arrayData[i]);
        }
    }

    // lets override toString( ) method
    @Override
    public String toString(){
        return Arrays.toString(this.arrayData);
    }

    // method to get array data size
    public  int getArrayDataSize(){
        return arrayDataSize;
    }

    // method to get any item
    public Object getItem(int index){
        return this.arrayData[index];
    }

    
    // Some static methods inside generic class

    public static Number sumOfItems( GenericArrayList< ? extends Number > list ){
        Number sum1;
        Float sum=0f;
        for( int i=0;i<=list.getArrayDataSize()-1;i++ ){
            sum += (Float)list.getItem(i); // nicely done type casting
        }
        sum1 = sum;
        return sum1;

    }

    public static void displayItems( GenericArrayList< ? > list ){
        for( int i=0;i<=list.getArrayDataSize()-1;i++ ){
            System.out.println(list.getItem(i));
        }
    }


}
