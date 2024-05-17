


import java.util.Arrays;



public class First{

  static int num = 100;

  public static void main(String[] args) {
    
    int num;  // redeclaration of num, from here on the previous initialization of num is shadowed
    num = 200;
    System.out.println(num); // 200

    System.out.println(temp());  // 100

  }


  static int temp(){
    return num;
  }


  
}





