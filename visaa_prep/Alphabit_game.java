import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashMap<Character,Integer>h=new HashMap<>();
        h.put('a',1);
        h.put('e',1);
        h.put('i',1);
        h.put('o',1);
        h.put('u',1);
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                v++;
            }
               else if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122){
                   c++;
               }
        }
               System.out.print(v+","+c);
    }
}
