import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

final int nonLeapDays8Mths =243;
        final int nonLeapSepDay = 256 - nonLeapDays8Mths;
        final int transitYearSepDay = 256 - (31+15+31+30+31+30+31+31);
        String resultFormat =".09."+ year;
        
        if (year==1918) {
            return  transitYearSepDay + resultFormat;
        } else {
            if(year>=1700 && year<=1917) {
            return ((year%4==0)? (nonLeapSepDay-1):(nonLeapSepDay))+resultFormat;

            } else {
                return ((year%400 == 0 || (year%4 == 0 && year%100 != 0))?      (nonLeapSepDay-1):(nonLeapSepDay))+resultFormat;
                }
            }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
