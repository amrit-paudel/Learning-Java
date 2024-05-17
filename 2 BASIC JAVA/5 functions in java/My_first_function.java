import java.util.Scanner;

// import java.util.Scanner;


public class First{
  public static void main(String[] args) {

    sum();
     
  }

  static void sum(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the numbers to sum up");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    System.out.println("The sum of numbers is "+(num1+num2));

    input.close();
  }

  
}

