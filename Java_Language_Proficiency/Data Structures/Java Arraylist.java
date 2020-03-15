import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList <ArrayList<Integer>> arrayLists = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            String[] arr = scanner.nextLine().split(" ");
            int arrLength = Integer.parseInt(arr[0]);
            ArrayList<Integer> a1 =new ArrayList<>();
            for (int j =1; j<=arrLength; j++) a1.add(Integer.parseInt(arr[j]));
            arrayLists.add(a1);

        }
        int noOfQueries = scanner.nextInt();
        scanner.nextLine();

        for (int k = 1;k <= noOfQueries; k++){

            int y = scanner.nextInt()-1;
            scanner.skip(" ");
            int x = scanner.nextInt()-1;
            if (arrayLists.get(y).size() > x) {
                System.out.println(arrayLists.get(y).get(x));

            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();

    }
}
