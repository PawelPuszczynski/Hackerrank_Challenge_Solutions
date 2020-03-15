import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> stringSet = new HashSet<String>();

        int count =0;

        for (int i =0; i<t; i++) {
            int size = stringSet.size();
            StringBuilder sb = new StringBuilder(pair_left [i]);
            sb.append(" ");
            sb.append(pair_right[i]);
        
            stringSet.add(sb.toString());

            if (stringSet.size() > size) {
                count++;
            }
            System.out.println(count);
        }
//Write your code here

    }
}