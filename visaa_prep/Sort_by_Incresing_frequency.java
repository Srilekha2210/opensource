import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
            if(h.containsKey(a.get(i))){
                h.put(a.get(i),h.get(a.get(i))+1);
            }
            else{
                h.put(a.get(i),1);
            }
        }
       
        Collections.sort(a,(n1,n2)->{
            if(h.get(n1)!=h.get(n2)){
                return h.get(n1)-h.get(n2);
            }
            return a.indexOf(n1)-a.indexOf(n2);
        });
        for(int i=0;i<n;i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
