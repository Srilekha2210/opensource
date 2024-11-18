import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        int i=1;
        while(i<=n){
            a.add(i);
            i++;
        }
        System.out.print(a);
    }
}
