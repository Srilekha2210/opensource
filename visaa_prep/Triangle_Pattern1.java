import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(r+" ");
                r++;
            }
            System.out.print("\n");
        }
    }
}
