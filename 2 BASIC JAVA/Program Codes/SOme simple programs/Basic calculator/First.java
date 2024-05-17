


import java.util.Scanner;
//import java.lang.Math;

public class First{
  public static void main(String[] args) {
    char ch;
    Scanner input = new Scanner(System.in);

    while(true){
      System.out.println("What you want to do ?");
      System.out.println("1. Addition ");
      System.out.println("2. Subtraction ");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println();

      System.out.println("Press E to exit");
      System.out.println();

      System.out.println("Enter your choice.......?");
      ch = input.next().trim().charAt(0);

      if( ch=='E' || ch=='e' ){
        break;
      }
      else{
        switch(ch){
          case '1':
          while(true){
            System.out.println("Enter two numbers to add");
            int num1,num2;
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println("Sum : "+(num1+num2));

            System.out.println("Enter e or E to exit And C to continue");

            ch = input.next().trim().charAt(0);

            if( ch=='E' || ch=='e' ){
              break;
            }
            else{
              continue;
            }


          }

        }
      }

    }

    input.close();

  }
}