/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.java;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url
 */
public class JavaBasicHashSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		
		HashSet<String> resultSet = new HashSet<String>();
		for(int index = 0 ; index< t ; index++) {
			resultSet.add(pair_left[index]+pair_right[index]);
			
		}
		
		System.out.println(resultSet.size());
	}
}
