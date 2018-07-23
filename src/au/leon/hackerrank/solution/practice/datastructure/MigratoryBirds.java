package au.leon.hackerrank.solution.practice.datastructure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * 
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url
 */
public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] ar) {
        HashMap<Integer, Integer> resultMap = new HashMap<Integer,Integer>();
        for(int a : ar){
            if(resultMap.get(a) == null){
                resultMap.put(a,1);
            }else{
                resultMap.put(a,resultMap.get(a)+1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> resultList = new ArrayList<Map.Entry<Integer,Integer>>(resultMap.entrySet());
        Collections.sort(resultList, (s1,s2)->
        	s1.getValue() - s2.getValue()
        );
        return resultList.get(0).getKey();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = migratoryBirds(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
