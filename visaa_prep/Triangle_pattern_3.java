import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i;j<n;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
