import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
        int r=0;
        for(int i=0;i<s.length();i++){
            r=r+(s.charAt(i)-'0');
        }
        if(r%2==0){
            System.out.print("Vignesh");
        }
        else{
            System.out.print("Charan");
        }
    }
}
