import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arrayOfInts = new int[n];

        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int arrElement = Integer.parseInt(arr[i]);
            arrayOfInts[i] = arrElement;
        }

        int count = 0;
        int sum = 0;
        for (int j = 0; j < n; j++) {

           if (arrayOfInts[j] < 0) count++;
            sum = arrayOfInts[j];

            for (int k =j+1; k<n; k++){

                if (sum + arrayOfInts[k]<0) count++;

                sum= sum + arrayOfInts[k];
            }
        }
        System.out.println(count);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
