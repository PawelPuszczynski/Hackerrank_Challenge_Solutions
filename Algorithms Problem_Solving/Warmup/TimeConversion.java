import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if (s.substring(8, 9).equals("A")) {
            if (s.substring(0, 2).equals("12")) {
                return ("00" + s.substring(2, 8));
            } else {
                return s.substring(0, 8);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                return s.substring(0, 8);
            } else {
                return (Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, 8));
            }
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
