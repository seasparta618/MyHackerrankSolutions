/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url
 */
public class SimpleMaxMinSum {
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	for(int ar : arr) {
    		arrList.add(ar);
    		//System.out.println(ar);
    	}
    	arrList.sort((arr1, arr2) -> arr1-arr2);
    	long min = arrList.get(0);
    	long max = arrList.get(arrList.size()-1);
    	for(int index = 1 ; index < arrList.size()-1 ; index++) {
    		min = min+arrList.get(index);
    		max = max+arrList.get(index);
    	}
    	System.out.println(min);
    	System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
