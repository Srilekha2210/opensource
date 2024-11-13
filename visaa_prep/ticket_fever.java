import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
       int a[][]=new int[m][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            if(a[i][0]>a[i][1]){
                System.out.print(a[i][0]-a[i][1]+"\n");
            }
            else{
                System.out.print(0+"\n");
            }
        }
    }
}
