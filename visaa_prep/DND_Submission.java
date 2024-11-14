import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%k==0){
                s1+=a[i];
            }
            else{
                s2+=a[i];
            }
            
        }
        System.out.print(s1-s2);
    }
}
