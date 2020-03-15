import java.io.*;
import java.util.*;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         int number = 1;
       
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(number + " " + input);
            number++;
        }
        scanner.close();
    }
}

