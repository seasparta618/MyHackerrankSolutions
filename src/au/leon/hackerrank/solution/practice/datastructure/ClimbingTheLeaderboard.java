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
 * @url https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbingTheLeaderboard {
	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
        LinkedList<Integer> rankList = new LinkedList<Integer>();
        for (int score : scores) {
            if (!rankList.contains(score)) {
                rankList.add(score);
            }
        }
        int lastIndex = rankList.size() - 1;
        for (int index = 0; index < alice.length; index++) {
            for (; lastIndex > 0; lastIndex--) {
                if (rankList.get(lastIndex) > alice[index]) {
                    //rankList.add(lastIndex + 1, alice[index]);
                    alice[index] = lastIndex + 2;
                    
                    break;
                }else if(rankList.get(lastIndex) == alice[index]) {
                    alice[index] = lastIndex+1;
                    //System.out.println();
                    break;
                }
            }
            if (lastIndex == 0) {
            	if(rankList.get(lastIndex) == alice[index]) {
            		alice[index] = lastIndex + 1;
            	}else if(rankList.get(lastIndex) < alice[index]) {
            		 //rankList.add(0, alice[index]);
            		 alice[index] = lastIndex + 1;              
                     
            	}else if(rankList.get(lastIndex) > alice[index]) {
            		//rankList.add(1, alice[index]);
            		alice[index] = lastIndex + 2;
            	}
            }

        }
        return alice;
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		//
		// int scoresCount = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// int[] scores = new int[scoresCount];
		//
		// String[] scoresItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// for (int i = 0; i < scoresCount; i++) {
		// int scoresItem = Integer.parseInt(scoresItems[i]);
		// scores[i] = scoresItem;
		// }
		//
		// int aliceCount = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// int[] alice = new int[aliceCount];
		//
		// String[] aliceItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		// for (int i = 0; i < aliceCount; i++) {
		// int aliceItem = Integer.parseInt(aliceItems[i]);
		// alice[i] = aliceItem;
		// }
		//
		// int[] result = climbingLeaderboard(scores, alice);
		//
		// for (int i = 0; i < result.length; i++) {
		// bufferedWriter.write(String.valueOf(result[i]));
		//
		// if (i != result.length - 1) {
		// bufferedWriter.write("\n");
		// }
		// }
		//
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();
		//
		// scanner.close();
		
		int number = scanner.nextInt();
		int scores[] = new int[number];
		for(int i = 0 ; i < number ; i++) {
			scores[i] = scanner.nextInt();
		}
		number = scanner.nextInt();
		int alice[] = new int[number];
		for(int i = 0 ; i < number ; i++) {
			alice[i] = scanner.nextInt();
		}
		alice = climbingLeaderboard(scores, alice);
		for(int rank : alice) {
			System.out.print(rank+" ");
		}

	}
}
