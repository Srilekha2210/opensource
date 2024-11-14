import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        if(n==0){
            System.out.print("true");
            return;
        }
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
    }
}
