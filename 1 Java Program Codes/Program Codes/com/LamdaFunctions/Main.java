

package com.LamdaFunctions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.forEach( (item)->{
            System.out.println(item);
        } );

    }
}

// lamda functions similar to arrow function in JS
// but here -> is used intead of => in JS
// 