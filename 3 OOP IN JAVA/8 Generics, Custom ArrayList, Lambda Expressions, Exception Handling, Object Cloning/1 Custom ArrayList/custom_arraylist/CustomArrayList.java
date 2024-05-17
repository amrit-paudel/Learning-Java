

package com.custom_arraylist;

import java.util.Arrays;

public class CustomArrayList {
    
    // first of all writing all the required variables
    private int arrayData[];
    private int arrayDataSize;
    private static int DEFAULT_SIZE = 10;

    // now writing all the required methods

    // First of all constructor
    CustomArrayList(){
        this.arrayDataSize = 0;
        this.arrayData = new int[DEFAULT_SIZE];
    }

    
    // method to add data
    public void add(int data){
        if( this.isFull() ){
            this.resize();
        }
        this.arrayData[this.arrayDataSize++] = data;
    }

    // to check of the array is full or not
    private boolean isFull(){
        return this.arrayDataSize == this.arrayData.length;
    }

    // to resize the array
    private void resize(){
        int tempArray[] = new int[this.arrayData.length*2];

        for( int i=0;i<=this.arrayData.length-1;i++ ){
            tempArray[i] = this.arrayData[i];
        }

        this.arrayData = tempArray;
    }

    // to remove an item
    public void remove(){
        --this.arrayDataSize;
    }

    // to set item in an index
    public void set( int item, int index ){
        if( index <= this.arrayData.length-1 ){
            this.arrayData[index] = item;
        }
        this.add(item);
    }

    // overridding toString ( ) method for this class
    @Override
    public String toString( ){
        String temp = "[ ";
        for( int i=0;i<=this.arrayDataSize-1;i++ ){
            temp = temp.concat( Integer.toString(this.arrayData[i]) );
            temp = temp.concat(", ");
        }
        String temp1="";
        for( int i=0;i<=temp.toCharArray().length-1-1-1;i++ ){
            temp1 += temp.toCharArray()[i];
        }

        temp1 = temp1.concat(" ]");
        return temp1;

    }

    // to display the data

    public void display(){
        
        System.out.println( Arrays.toString(this.arrayData) );
    }



    

    
}
