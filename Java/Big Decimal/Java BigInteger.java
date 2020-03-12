import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       String a = scanner.nextLine();
        String b = scanner.nextLine();

        scanner.close();

        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

