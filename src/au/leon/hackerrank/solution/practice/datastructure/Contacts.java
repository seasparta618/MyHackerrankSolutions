package au.leon.hackerrank.solution.practice.datastructure;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/contacts/problem
 */
public class Contacts {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalNumbers = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int count = 0; count < totalNumbers; count++) {
			String[] queries = br.readLine().split(" ");

			if (queries[0].equals("add")) {
				for (int length = 1; length <= queries[1].length(); length++) {
					String sub = queries[1].substring(0, length);
					if (map.get(sub) == null) {
						map.put(sub, 1);
					} else {
						map.put(sub, map.get(sub) + 1);
					}
				}
			} else {
				if (map.get(queries[1]) == null) {
					System.out.println(0);
				} else {
					System.out.println(map.get(queries[1]));
				}

			}
		}
		map.forEach((k,v)->{
			System.err.println(k+" "+v);
		});
	}
}