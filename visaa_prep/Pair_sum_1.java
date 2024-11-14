import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(h.containsKey(a[i])){
                h.put(a[i],1);
            }
            else{
                h.put(a[i],1);
            }
        }
        int r=sc.nextInt();
       for(int k:h.keySet()){
           if(h.containsKey(r-k)){
               System.out.print("true");
               return;
           }
       }
        System.out.print("false");
    }
}
