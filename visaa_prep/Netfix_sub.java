import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int c=sc.nextInt();
        int res=0;
        int a[]=new int[3];
        int n=3;
        a[0]=x;
        a[1]=y;
        a[2]=z;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=a[i]+a[j];
                if(res>=c){
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
        
    }
}
