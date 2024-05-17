


import java.util.Scanner;

public class First{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number ");

    int num = input.nextInt();
    System.out.println("Enter a digit to count");
    int digit = input.nextInt();
    int counter=0;

    while( num!=0 ){
      System.out.println("Inside while loop");
      int temp = num%10;
      if( temp == digit ){
        counter=counter+1;
        num=num/10;
      }
      else{
        num=num/10;
      }

    }
    System.out.println(counter);


    input.close();

  }
}