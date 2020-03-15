import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	 String content = ".*?<(.+>)([^<>]+)(<[/]\\1)" ;

            Pattern pattern = Pattern.compile(content);
            Matcher matcher = pattern.matcher(line);

               
               if (!matcher.find()) {
                   System.out.println("None");
               } else {

                   matcher.reset();
                   while (matcher.find()) {
                       System.out.println(matcher.group(2));

                   }
               }
			testCases--;
		}
	}
}



