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
        int res=0,max=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                res=1;
                for(int j=i+1;j<n;j++){
                    if(a[j]==1){
                        break;
                    }
                    res++;
                    i++;
                }
            }
            if(max<res){
                max=res;
            }
            
        }
        System.out.print(max);
        
    }
}
