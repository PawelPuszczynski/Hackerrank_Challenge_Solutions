import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.*;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchAlgorithmException{

      String input = scanner.nextLine();
        byte [] byteArray = input.getBytes();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte [] digestArray = messageDigest.digest(byteArray);

        BigInteger bigInteger = new BigInteger(1, digestArray);
        String hashHex = bigInteger.toString(16);
        System.out.println(hashHex);  
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}