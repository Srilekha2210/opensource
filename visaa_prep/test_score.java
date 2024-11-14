import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int r=x*n;
        if(y%x==0&&r>y){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
