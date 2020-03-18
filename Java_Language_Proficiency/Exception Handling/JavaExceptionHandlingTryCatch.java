import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);

        } catch (InputMismatchException e) {
            System.out.println( e.toString().substring(0,32));
        } catch(ArithmeticException e) {
            System.out.println( e.toString());
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}