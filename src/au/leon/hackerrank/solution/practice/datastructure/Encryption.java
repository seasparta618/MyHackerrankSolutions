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
 * @url https://www.hackerrank.com/challenges/encryption/problem
 */
public class Encryption {

	// Complete the encryption function below.
	static String encryption(String s) {
		int length = s.replaceAll(" ", "").length();
		int piecesCount = (int) Math.ceil(Math.pow(length, 0.5));
		//int neibCount = (int) Math.floor(Math.pow(length, 0.5));
		String result = "";
		for(int piece = 0 ; piece < piecesCount ; piece++) {
			for(int index = piece ; index < length ; index+= piecesCount) {
				result = result+s.charAt(index);
			}
			result = result + " ";
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String s = scanner.nextLine();
//
//		String result = encryption(s);
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
		System.out.println(encryption("feedthedog"));
	}
}
