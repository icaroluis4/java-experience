import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int len = arr.size();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        //double result = 0.0;
        
        for (int i = 0; i < len; i++){
             //System.out.println(arr.get(i));
            if(arr.get(i) > 0){
                 pos ++;
            }
            else if(arr.get(i) < 0){
                 neg ++;
            }
            else{
                 zero ++;
            }
              
        }
        System.out.println(pos/len);
        System.out.println(neg/len);
        System.out.println(zero/len);
         
         

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
            
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
