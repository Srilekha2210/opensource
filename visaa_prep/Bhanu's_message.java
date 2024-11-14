import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>14||s.length()<13){
            System.out.print("Incorrect");
            return;
        }
        for(int i=1;i<=2;i++){
            if(!Character.isDigit(s.charAt(i))){
                System.out.print("Incorrect");
                return;
            }
        }
        for(int i=1;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                if(s.charAt(i)!=' '){
                    System.out.print("Incorrect");
                    return;
                }
            }
        }
        System.out.print("Correct");
    }
}
