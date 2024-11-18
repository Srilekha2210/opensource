import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Integer,Integer>h=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        
                h.put(a[i],i);
        
        }
        int t=sc.nextInt();
        if(h.containsKey(t)){
            System.out.print(h.get(t));
            return;
        }
        else{
            System.out.print(-1);
        }
        
    }
}
