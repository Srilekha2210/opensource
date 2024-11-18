import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> a) {
    // Write your code here
        int n=0,p=0,z=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>0){
                p++;
            }
            else if(a.get(i)<0){
                n++;
            }
            else{
                z++;
            }
        }
        System.out.printf("%.6f"+"\n",(double)p/a.size());
        System.out.printf("%.6f"+"\n",(double)n/a.size());
        System.out.printf("%.6f"+"\n",(double)z/a.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
