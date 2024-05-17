

package com.object_cloning;

import java.util.Arrays;

public class Human implements Cloneable {

    String name;
    int marks[];
    
    // a parametrized constructor
    Human( String name, int marks[] ){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Name : "+this.name+" "+ Arrays.toString(this.marks);
    }
    

    @Override
    public Object clone() throws CloneNotSupportedException{
        Human temp = (Human)super.clone();
        temp.marks = new int[this.marks.length];
        for( int i=0;i<=this.marks.length-1;i++ ){
            temp.marks[i] = this.marks[i];
        }

        return temp;
    }
    
}
