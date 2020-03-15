import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
       
        int positiveNums = 0;
        int negativeNums = 0;
        int zeros = 0;
        int numberOfElements = arr.length;

        for (int i = 0; i < numberOfElements; i++) {

            if (arr [i] > 0) {
                positiveNums ++;
            } else if (arr [i] < 0) {
                negativeNums ++;
            } else zeros ++;
        } 
        System.out.printf("%f%n", (double)positiveNums/numberOfElements );
        System.out.printf("%f%n", (double)negativeNums/numberOfElements );
        System.out.printf("%f%n", (double)zeros/numberOfElements );


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
