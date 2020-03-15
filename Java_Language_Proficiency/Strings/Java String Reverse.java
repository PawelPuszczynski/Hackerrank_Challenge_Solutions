import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder reverse = new StringBuilder();
        char[] charArray = A.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
                reverse.append(charArray[charArray.length - 1 - i]);
            }
            if (reverse.toString().equals(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
        }
    }

}


