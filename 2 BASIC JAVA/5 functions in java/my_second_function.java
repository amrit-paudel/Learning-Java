import java.util.Scanner;

// import java.util.Scanner;


public class First{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name ?");
    String name = input.nextLine();

    System.out.println(greet(name));

    input.close();
     
  }

  static String greet(String name){
    return "Hello Good Evening "+name;
  }

  
}

