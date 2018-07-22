/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice30days;

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
public class Day10 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int power;
		for (power = 0; (int) Math.pow(2, power) < n; power++) {
		}
		System.err.println(power);
		StringBuilder sb = new StringBuilder();
		for (power = power - 1; power >= 0; power--) {
			if ((int) n / (int) Math.pow(2, power) != 0) {
				sb.append(1);
				n = n - (int) Math.pow(2, power);
			} else {
				sb.append(" ");
			}
		}
		System.err.println(sb);
		String strs[] = sb.toString().split(" ");
		int length = 0;
		Arrays.stream(strs).forEach(str -> {
		});
		scanner.close();
	}
}