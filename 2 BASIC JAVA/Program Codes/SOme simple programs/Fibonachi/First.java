


import java.util.Scanner;

public class First{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a nuber for the fibonachi series");
    int num = input.nextInt();
    int a=0;
    int b=1;

    System.out.println(a);
    System.out.println(b);
    for( int i=3;i<=num;i++ ){

      System.out.println(a+b);
      a=b;
      b=a+b;
      
      
    }

    input.close();

  }
}