import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char k=sc.next().charAt(0);;
        if(c==k){
            System.out.print("NULL");
            return;
        }
        if(c=='P'&&k=='R'){
            System.out.print("Vignesh");
            return;
            
        }
        else if(c=='S'&&k=='P'){
            System.out.print("Vignesh");
            return;
        }
        else if(c=='R'&&k=='S'){
            System.out.print("Vignesh");
            return;
        }
        System.out.print("Charan");
    }
}
