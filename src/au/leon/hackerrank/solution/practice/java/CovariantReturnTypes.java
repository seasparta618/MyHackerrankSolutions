/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-covariance/problem?h_r=next-challenge&h_v=zen
 */

class Flower {
	public String whatsYourName() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {
	
	@Override
	public String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower{
	@Override
	public String whatsYourName() {
		return "Lily";
	}
}

class Region {
	public Flower yourNationalFlower(){
		return new Flower();
	}
}

class WestBengal extends Region{
	@Override
	public Flower yourNationalFlower(){
		return new Jasmine();
	}
}

class AndhraPradesh extends Region{
	@Override
	public Flower yourNationalFlower(){
		return new Lily();
	}
}

public class CovariantReturnTypes {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		Region region = null;
		switch (s) {
		case "WestBengal":
			region = new WestBengal();
			break;
		case "AndhraPradesh":
			region = new AndhraPradesh();
			break;
		}
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
	}
}
