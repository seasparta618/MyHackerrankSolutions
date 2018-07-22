/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hacherrank.solution.compete.Jul21AllWomen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url
 */
public class MinimumHotel {

	// Complete the solve function below.
	static int solve(List<Integer> customers, int k) {

		TreeSet<Integer> customerSet = new TreeSet<Integer>();
		for (int customer : customers) {
			customerSet.add(customer);
		}
		ArrayList<Integer> newList = new ArrayList<Integer>(customerSet);
		newList.sort((int1, int2) -> int2 - int1);
		System.out.println(newList.toString());
		int totalSize = newList.size();
		int lastHotel = newList.get(0) - k;
		int totalHotel = 1;
		for (int i = 1; i < totalSize; i++) {
			//System.out.println(lastHotel);
			if (Math.abs(lastHotel - newList.get(i)) > k) {
				lastHotel = newList.get(i) - k;
				totalHotel = totalHotel+1;
			}
			System.out.println(lastHotel);
			
		}
		return totalHotel;
	}

	public static void main(String[] ar) {
		List<Integer> list = new ArrayList<Integer>();
		// Random rm = new Random();
		// for(int i = 0 ; i < 10 ; i++) {
		// int element = rm.nextInt(15)+1;
		// list.add(element);
		// System.out.println(element);
		// }
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(2);
		System.out.println("------------------>");
		System.out.println(solve(list, 2));
	}
}
