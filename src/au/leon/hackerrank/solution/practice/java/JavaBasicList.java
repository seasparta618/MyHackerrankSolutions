/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-list/problem
 */
public class JavaBasicList {
		
	public static void main(String []ar) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		for(int sequence = 0 ; sequence < size ; sequence ++) {
			numberList.add(sc.nextInt());
		}
		int operationTimes = sc.nextInt();
		for(int sequence = 0 ; sequence < operationTimes ; sequence ++) {
			String operation = sc.next();
			if(operation.equals("Insert")) {
				int index = sc.nextInt();
				int element = sc.nextInt();
				numberList.add(index, element);
			}else if(operation.equals("Delete")) {
				int index = sc.nextInt();
				numberList.remove(index);
			}
		}
		numberList.forEach(number -> {System.out.print(number+" ");});
	}
	
}
