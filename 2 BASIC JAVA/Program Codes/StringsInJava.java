import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StringsInJava{
    public static void main(String[] args) {
        
        String name = "";

        for( int i=0;i<=26-1;i++ ){
            char ch = (char)('a' + i);
            name += ch;
        }

        System.out.print(name);

    }
}