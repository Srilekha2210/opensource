import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=0,m=0;
        for(int i=0;i<n;i++){
            r=r+a[i];
            if(r>m){
                m=r;
            }
           
        }
       
        System.out.print(m);
    }
}
