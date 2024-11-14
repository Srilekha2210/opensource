import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int t=sc.nextInt();
        int c=sc.nextInt();
        int cu=m+t;
        if(cu>c){
            System.out.print(0);
            return;
        }
        int n=1;
        while(c>=cu+m){
            cu=cu+m;
            n++;
        }
        System.out.print(n);
    }
}
