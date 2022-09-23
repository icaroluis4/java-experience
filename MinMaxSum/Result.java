import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int max = arr.get(0);
        int min = arr.get(0);
        long resultmax = 0;
        long resultmin = 0;
        
        for(int i = 1 ; i < arr.size() ; i++){
            
            if(max < arr.get(i)){
               // resultmax += max;
                max = arr.get(i);
            }
            
            if(min > arr.get(i)){
               // resultmin += min;
                min = arr.get(i);
            } 
        }
        
         for(int i = 0 ; i < arr.size() ; i++){
            
            if(max != arr.get(i)){
                resultmax += arr.get(i);
               // max = arr.get(i);
            }
         
            
            if(min != arr.get(i)){
                resultmin += arr.get(i);
               // min = arr.get(i);
            }
            
            if( max == min ){
                resultmax += max;
                resultmin += min;
            }
            
        }
        
        if( max == min ){
             resultmax -= max;
             resultmin -= min;
        }
        
        System.out.println(resultmax + " " + resultmin);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
