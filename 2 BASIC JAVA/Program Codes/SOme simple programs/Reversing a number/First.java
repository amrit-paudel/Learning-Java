


import java.util.Scanner;
import java.lang.Math;

public class First{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number ");

    int num = input.nextInt();
    int temp = num;
    int counter = 0;
    while( num!=0 ){
      num=num/10;
      counter = counter+1;
    }

    num = temp;  // this is important since here num has already become 0 so we need to re initialize
    
    int reverseNum=0;
    for( int i=1;i<=counter;i++ ){
      reverseNum += ((num%10) * (int)Math.pow(10,counter-i));
      num = num/10;
    }
    System.out.println(reverseNum);



    input.close();

  }
}