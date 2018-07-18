package au.leon.hackerrank.solution.practice.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparatorJava8Version {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, (Player p1, Player p2) -> {
			return p2.score == p1.score?p1.name.compareTo(p2.name):
				(p2.score > p1.score? 1 : -1);
		});
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

}