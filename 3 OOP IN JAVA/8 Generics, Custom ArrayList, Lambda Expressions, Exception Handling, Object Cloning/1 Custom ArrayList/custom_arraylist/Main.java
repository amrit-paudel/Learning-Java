

package com.custom_arraylist;



public class Main{
    public static void main(String[] args) {

        CustomArrayList nums = new CustomArrayList();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums.toString());

        nums.remove();
        System.out.println( nums.toString() );

        nums.set(100, 2);
        System.out.println( nums.toString() );

    }
}