import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0&&n%100!=0){
            System.out.print("YES");
        }
        else if(n%400==0&&n%100==0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
