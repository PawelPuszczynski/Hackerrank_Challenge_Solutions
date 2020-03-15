import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int minScore = scores[0];
        int maxScore = scores[0];
        int minRecordBreak = 0;
        int maxRecordBreak = 0;
        
        for (int element : scores) {

            if (element > maxScore) {
                maxScore = element;
                System.out.println("maxScore =" + maxScore);
                maxRecordBreak++;
                System.out.println("maxRecordBreak count =" + maxRecordBreak);
            }
            if (element < minScore) {
                minScore = element;
                System.out.println("minScore =" + minScore);
                minRecordBreak++;
                System.out.println("minRecordBreak count =" + minRecordBreak);
            }
        }
        int [] recordBreakArray = new int[]{maxRecordBreak, minRecordBreak};
        return recordBreakArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
