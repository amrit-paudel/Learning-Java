

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("ENter number to check Armstrong ?");
        int num = input.nextInt();
        System.out.println(isArmstrong(num));


        // System.out.println("Printing all the three digit armstrong numners");

        printArmstrong();

        input.close();

        // int num = 100;
        // System.out.println(num%10);
        // num = num/10;
        // System.out.println(num%10);
        // num = num/10;
        // System.out.println(num%10);

    }

    static boolean isArmstrong(int num){
        int num1 = num;
        int sum = 0;
        while( num!=0 ){
            int rem = num%10;
            num = num/10;
            sum += Math.pow(rem, 3);

        }
        if( sum == num1 ){
            return true;
        }
        else{
            return false;
        }
    }

    static void printArmstrong(){
        for( int i=100;i<=999;i++ ){
            int digit1,digit2,digit3,num;

            num = i;
            
            digit1 = num%10; num=num/10;
            digit2 = num%10; num=num/10;
            digit3 = num%10; num=num/10;

            digit1 = i%10; i=i/10;
            digit2 = i%10; i=i/10;
            digit3 = i%10; i=i/10;



            if( ((digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3)) == i ){
                System.out.println(i);
            }
            else{
                continue;
            }


        }
    }

    static boolean isPrime(int num){
        int flag = 1;

        for( int i=2;i*i<=num;i++ ){
            if( num%i == 0 ){
                flag = 0;
            }
        }

        if( flag == 0 ){
            return false;
        }
        else{
            return true;
        }

    }


    
}
