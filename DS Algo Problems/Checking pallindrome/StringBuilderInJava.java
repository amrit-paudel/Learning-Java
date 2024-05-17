import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilderInJava {
    public static void main(String[] args) {
        
        String name = "abcba";

        System.out.println( isPallindrome(name) );
    }

    static boolean isPallindrome( String str ){
        int flag = 1;
        int front = 0;
        int back = str.length()-1;

        while( front < back ){ // or we could also do while ( front != back )
            if( str.charAt(front) == str.charAt(back) ){
                flag = 1;
            }
            else{
                flag = 0;
            }
            front ++;
            back --;
        }
        return ( flag == 1 ) ? true : false;
    }
}
