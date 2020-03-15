import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        for (int i =1; i<s.length-2; i++) {

            if (new BigDecimal(s[i-1]).compareTo(new BigDecimal(s[i])) < 0 ) {
                String tempString = s[i-1];
                s[i-1]=s[i];
                s[i]=tempString;
                i=0;
            }
        }

        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}