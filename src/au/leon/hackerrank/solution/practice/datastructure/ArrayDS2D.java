/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/2d-array/problem
 */
public class ArrayDS2D {
	// Complete the hourglassSum function below.
	public static int hourglassSum(int arr[][]) {
		int sizeV = arr.length;
		int sizeH = arr[0].length;
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int sum = 0;
		for (int indexV = 0; indexV < sizeV - 2; indexV++) {
			for (int indexH = 0; indexH < sizeH - 2; indexH++) {
				sum = arr[indexV][indexH] + arr[indexV][indexH+1]+arr[indexV][indexH+2]
						+ arr[indexV+1][indexH+1]
					+arr[indexV+2][indexH]+arr[indexV+2][indexH+1]+arr[indexV+2][indexH+2];
				resultList.add(sum);
			}
		}
		int largest = resultList.get(0);
		for(int result : resultList) {
			if(largest < result) {
				largest = result;
			}
		}
		return largest;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

