import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        String answer;
        if ((A.compareTo(B)) > 0) {
            answer ="Yes";
        } else answer= "No";
        
        System.out.println(sum);
        System.out.println(answer);
        System.out.println(A.substring (0,1).toUpperCase() + A.substring(1)
                + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}



