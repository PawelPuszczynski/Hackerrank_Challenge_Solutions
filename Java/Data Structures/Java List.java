import java.io.*;
import java.util.*;

public class Solution {

public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> arrList = new ArrayList<>(n);

        String[] arrString = scanner.nextLine().split(" ");
        for (String element : arrString) arrList.add(Integer.parseInt(element));

        int q = scanner.nextInt();
        for (int i = 0; i <= q; i++) {

            String operation = scanner.nextLine().trim();
            if (operation.equals("Delete")) {
                int x = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                arrList.remove(x);
            }
            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                scanner.skip(" ");
                int y = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                arrList.add(x, y);
            }
        }
        scanner.close();
        for (Integer element : arrList) {
            System.out.print(element + " ");

        }
    }
}
