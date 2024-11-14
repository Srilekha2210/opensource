import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=n;
       
        ArrayList<Integer>a=new ArrayList<>();
        while(t>1){
        a.add(t%2);
        t=t/2;
        }
        if(m<a.size()&&m>=1){
        if(a.get(m-1)==1){
            System.out.print("true");
            return;
        }
        else{
            System.out.print("false");
            return;
        }}
        System.out.print("false");
    }
}
