

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListExample {

    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50};

        System.out.println("Max element in array : "+ findMax(nums));
        System.out.println("Reverse Array : " + Arrays.toString(reverseArray2(nums)) );
        swap( nums,0,nums.length-1 );
        System.out.println(Arrays.toString(nums));

    }
    

    // method to swap elements in an array
    static void swap( int[] nums, int startIndex, int endIndex ){
        if( startIndex == endIndex ){
            return;
        }
        else{
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
        }
    }
    
    // method to find maximum element in an array
    static int findMax(int[] nums){
        int max = nums[0];
        for( int temp : nums ){
            if( temp > max ){
                max = temp;
            }
        }

        return max;
    }
    

    // Method to reverse an array
    static int[] reverseArray ( int[] nums ){
        int[] reverseNum = new int[nums.length];
        
        for( int i = nums.length-1;i>=0;i-- ){
            reverseNum[nums.length-1 - i] = nums[i];
        }

        return reverseNum;
    }
    
    // another method to reverse an array
    static int[] reverseArray1 ( int[] nums ){
        int[] reverseArray = new int[nums.length];
        int tempIterator = nums.length-1;

        for( int temp : nums ){
            reverseArray[tempIterator--] = temp;
        }

        return reverseArray;

    }

   // another method to reverse an array
   static int[] reverseArray2 ( int[] nums ){
       int startIndex = 0;
       int endIndex = nums.length-1;
       int temp;

       for( int i=0;i<=nums.length-1;i++ ){
           if( startIndex == endIndex ){
               break;
           }
           else{
               temp = nums[startIndex];
               nums[startIndex] = nums[endIndex];
               nums[endIndex] = temp;
           }

           startIndex++;
           endIndex--;
           
       }

       return nums;
    }
    
}
