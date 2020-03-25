import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
         int [] arrDays = new int[j-i+1];
        int beautifulDays = 0;

        for (int l = 0; l < arrDays.length; l++) {
            arrDays [l]=i;
            i++;
        }
        for (int element : arrDays) {
            int reverse = 0;
            int storeElement = element;
            int m = (String.valueOf(element).length());
            for (int n =m; n >= 0; n--) {
                reverse += (element % 10) * Math.pow(10 , (n-1));
                element -= (element % 10);
                element = element/10;
            }
            if ((Math.abs(storeElement-reverse))%k==0) beautifulDays++;
        }
        return beautifulDays;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
