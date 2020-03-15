import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        
        long sum = 0;
        int tempMax = 1;
        int tempMin = (int) Math.pow(10,9);

        for (int element : arr) {
            sum += element;
            if (element <= tempMin) {
                 tempMin = element;
            }
            if (element >= tempMax) {
                tempMax = element;
            }
        }
        System.out.println((sum - tempMax) + " " + (sum - tempMin));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
