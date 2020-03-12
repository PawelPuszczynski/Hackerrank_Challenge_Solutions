import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         
        char[] charsA = a.toLowerCase().toCharArray();
        java.util.ArrayList<Character> charAarraylist = new java.util.ArrayList<>();
        for (char ch : charsA) {
            charAarraylist.add(ch);}


        char[] charsB = b.toLowerCase().toCharArray();
        java.util.ArrayList<Character> charBarraylist = new java.util.ArrayList<>();
        for (char ch : charsB) {
            charBarraylist.add(ch);}

        charAarraylist.sort(Character::compareTo);
        charBarraylist.sort(Character::compareTo);


        if (charAarraylist.equals(charBarraylist)) {
        return true; }
        else return false; // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}