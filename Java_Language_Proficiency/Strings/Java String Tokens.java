import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replaceAll("[^A-Za-z]", " ");

        String [] arrayOfStrings = s.trim().split("[\\s]+");

        if (arrayOfStrings[0].equals("") || s.length()==0) {
            System.out.println("0");
        } else {
            System.out.println(arrayOfStrings.length);
            for (String element : arrayOfStrings) {
                System.out.println(element);
            }
        }// Write your code here.
        scan.close();
    }
}

