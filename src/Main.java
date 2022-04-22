import java.util.*;
import java.io.*;

class Main {

    public static String MatrixSpiral(String[] strArr) {
        for(String element : strArr) {
            for(int i = 0; i<element.length();i++) {
                System.out.println(i);
            }

        }

        // code goes here
        return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MatrixSpiral(new String[] {"[1, 2]", "[10, 14]"}));
    }

}
