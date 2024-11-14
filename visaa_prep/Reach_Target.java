import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            a[i][j]=sc.nextInt();
                } }
        for(int i=0;i<n;i++){
            System.out.print(a[i][0]-a[i][1]+1+"\n");
            
        }
    }
}
