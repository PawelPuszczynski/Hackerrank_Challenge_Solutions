import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
     int bitSetLength =scanner.nextInt();
       int numOfOps = scanner.nextInt();
       scanner.nextLine();

       BitSet b1 = new BitSet(bitSetLength);
       BitSet b2 = new BitSet(bitSetLength);

       for (int i = 0; i < numOfOps; i++) {
           String [] operation = scanner.nextLine().split(" ");

           int setNo =Integer.parseInt(operation[1]);
           BitSet firstBitSet = (setNo ==1? b1 : b2);
           int index =Integer.parseInt(operation[2]);
           BitSet secBitSet = (index == 1? b1 : b2);

           switch (operation[0]) {

               case "AND" :
                   firstBitSet.and(secBitSet);
                   break;

               case "OR" :
                   firstBitSet.or(secBitSet);
                   break;

               case "XOR" :
                   firstBitSet.xor(secBitSet);
                   break;

               case "FLIP" :
                   firstBitSet.flip(index);
                   break;

               case  "SET" :
                   firstBitSet.set(index);
                   break;
           }
           System.out.println( b1.cardinality() + " " + b2.cardinality());
       }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
