import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(3<=n&&n<=5){
            System.out.print("Spring");
        }
        else if(6<=n&&n<=8){
            System.out.print("Summer");
        }
        else if(9<=n&&n<=11){
            System.out.print("Autumn");
        }
        else if(n==12||(1<=n&&n<=2)){
            System.out.print("Winter");
        }
        else{
            System.out.print("Invalid");
        }
    }
}
