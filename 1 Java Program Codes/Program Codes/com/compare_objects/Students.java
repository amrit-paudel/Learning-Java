

package com.compare_objects;

public class Students implements Comparable<Students>  {

    public int rollNo;
    public float marks;

    Students( int rollNo, float marks ){
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    @Override
    public int compareTo( Students s ){
        return (int)(this.marks - s.marks);
    }

    @Override
    public String toString(){
        return "Roll : "+this.rollNo+" "+"Marks : "+this.marks+" ";
    }


    
}
