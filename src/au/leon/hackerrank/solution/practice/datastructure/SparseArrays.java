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
public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	HashMap<String, Integer> strMap = new HashMap<String, Integer>();
    	int[] resultInts = new int[queries.length];
    	Arrays.asList(strings).forEach(str->{
    		if(strMap.get(str) == null) {
    			strMap.put(str, 1);
    		}else {
    			strMap.put(str,strMap.get(str)+1);
    		}
    	});
    	for(int index = 0 ; index <queries.length ; index++) {
    		if(strMap.get(queries[index])==null) {
    			resultInts[index] = 0;
    		}else {
    			resultInts[index] = strMap.get(queries[index]);
    		}
    	}
    	return resultInts;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
