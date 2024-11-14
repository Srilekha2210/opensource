import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long f=1;
        if(n==0){
            System.out.print(1);
            return;
        }
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.print(f);
    }
}
