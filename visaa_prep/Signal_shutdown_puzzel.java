import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[n][m];
       for(int i[]:b){
           Arrays.fill(i,1);
       }
        Set<Integer>r=new HashSet<>();
        Set<Integer>c=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(r.contains(i)||c.contains(j)){
                   System.out.print(0+" ");
               }
                else{
                    System.out.print(1+" ");
                }
            }
             System.out.print("\n");
        }
    }
}
