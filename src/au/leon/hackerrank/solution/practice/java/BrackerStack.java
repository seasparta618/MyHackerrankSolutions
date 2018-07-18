package au.leon.hackerrank.solution.practice.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author leon.wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-stack/submissions/code/78227832
 */
public class BrackerStack {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			
			String input = sc.next();
			
			System.out.println(isBalanced(input));
			
		}

	}
	
	private static boolean isBalanced(String input) {
		Stack<Character> bracketStack = new Stack<Character>();
		char thisChar;
		int length = input.length();
		for(int index = 0 ; index < length ; index++) {
			thisChar = input.charAt(index);
			if(thisChar == '}' || thisChar == ']' || thisChar == ')') {
				if(bracketStack.isEmpty()) {
					return false;
				}else {
					if(thisChar == '}' && bracketStack.pop()!='{') {
						return false;
					}
					if(thisChar == ']' && bracketStack.pop()!='[') {
						return false;
					}
					if(thisChar == ')' && bracketStack.pop()!='(') {
						return false;
					}
				}
			}else if(thisChar == '{' || thisChar == '[' || thisChar == '(') {
				bracketStack.push(thisChar);
			}
		}
		if(!bracketStack.isEmpty()) {
			return false;
		}
		return true;
	}
}
