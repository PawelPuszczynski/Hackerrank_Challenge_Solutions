import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Solution {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchAlgorithmException{

        String input = scanner.nextLine();
        byte [] byteArray = input.getBytes();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte [] digestArray = messageDigest.digest(byteArray);

        for (byte element : digestArray) {
            System.out.printf("%02x", element);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
