import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        Arrays.sort(a);
        int r=0;
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                for(int k=j-1;k>=0;k--){
                    int x=a[i];
                    int y=a[j];
                    int z=a[k];
                    if(x<y+z){
                    if(r<(x+y+z)){
                        r=x+y+z;
                    }
                    }
                }
            }
        }
        if(r>0){
            System.out.print(r);
            return;
        }
        System.out.print("-1");
    }
}
