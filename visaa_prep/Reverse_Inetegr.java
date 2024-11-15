import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=0;
        int ch=0;
if(s<0){
    s=-s;
    ch=1;
}       
        while(s>0){
            int d=s%10;
            if(c>Integer.MAX_VALUE/10||(c==Integer.MAX_VALUE/10&&d>Integer.MAX_VALUE%10)){
                System.out.print(0);
                return;
            }
            c=c*10+(d);
            s=s/10;
        }
       if(ch==1){
           c=-c;
       }
        System.out.print(c);
        
    }
}
