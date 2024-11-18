import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String r="";
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                r=r+Character.toUpperCase(s.charAt(i));
            }
            else{
                r=r+Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.print(r);
    }
}
