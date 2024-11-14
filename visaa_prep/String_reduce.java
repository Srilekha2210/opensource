import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       for(int i=0;i<s.length();i++){
          int res=1;
           int j=i+1;
           while(j<s.length()){
               if(s.charAt(i)!=s.charAt(j)){
                   break;
               }
               j++;
               res++;
           }
           i=j-1;
           System.out.print(s.charAt(i));
                            System.out.print(res);
       }
    }
}
