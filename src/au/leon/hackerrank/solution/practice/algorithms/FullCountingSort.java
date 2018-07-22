package au.leon.hackerrank.solution.practice.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/countingsort4/problem
 */
public class FullCountingSort {

	static StringBuilder list[]=new StringBuilder[100]; 

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(in.readLine());
		for(int i=0;i<100;i++)
        {
            list[i]=new StringBuilder();
        }
        for (int nItr = 0; nItr < number; nItr++) {
            String[] xs = in.readLine().split(" ");

            int x = Integer.parseInt(xs[0]);

            String s = xs[1];
            list[x].append(nItr < number / 2 ? "- " : s+" ");
            
            System.err.println(list[x]);
        }
        
        for(StringBuilder str : list) {
        	System.out.print(str);
        }
    }
}
