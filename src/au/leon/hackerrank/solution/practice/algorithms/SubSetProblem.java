package au.leon.hackerrank.solution.practice.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/non-divisible-subset/problem
 */
public class SubSetProblem {

	public static void main(String[] ar) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = bf.readLine().split(" ");
		int size = Integer.parseInt(firstLine[0]);
		int divisor = Integer.parseInt(firstLine[1]);
		System.err.println("size: " + size + "\n" + "divisor: " + divisor);
		String[] setElementStrs = bf.readLine().split(" ");
		long[] numbers = new long[size];
		for (int i = 0; i < setElementStrs.length; i++) {
			numbers[i] = Long.parseLong(setElementStrs[i]);
		}
		HashSet<Long> resultNumbers = new HashSet<Long>();
		for(int index = 0 ; index < numbers.length ; index++) {
			if(!checkNumber(numbers, index, divisor)) {
				resultNumbers.add(numbers[index]);
			}
		}
		
		System.out.println(resultNumbers.size());
	}
	public static boolean checkNumber(long[] numbers, int index, int divisor) {
		for(int i = 0 ; i < numbers.length ; i++) {
			if((numbers[i] + numbers[index])% divisor != 0 && i != index && numbers[i] != numbers[index]) {
				return false;
			}
		}
		return true;
	}
}



