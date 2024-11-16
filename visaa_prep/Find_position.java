import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=sc.nextInt();
        int a[]=new int[n+1];
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            h.put(a[i],i);
        }
        if(h.containsKey(f)){
            System.out.print(h.get(f));
            return;
        }
        a[n]=f;
        Arrays.sort(a);
        for(int i=0;i<n+1;i++){
            if(a[i]==f)
            System.out.print(i);
            
        }
        
    }
}
