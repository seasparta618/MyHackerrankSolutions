package au.leon.hackerrank.solution.practice.datastructure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * 
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfProgrammer {

	static String solve(int year) {

		if (year > 1918) {
			if (year % 4 == 0 && year % 100 != 0) {
				return "12.09." + year;
			} else if (year % 400 == 0) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else if (year < 1918) {
			if (year % 4 == 0) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else {
			return "12.09." + year;
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int year = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = solve(year);
		System.out.println(result);
		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
