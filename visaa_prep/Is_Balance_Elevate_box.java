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
        
        for(int i=0;i<n;i++){
            int l=0;
            int r=0;
            for(int j=i-1;j>=0;j--){
                l=l+a[j];
            }
            for(int j=i+1;j<n;j++){
                r=r+a[j];
            }
            System.out.print(Math.abs(l-r)+" ");
        }
       
    }
}
