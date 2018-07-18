package au.leon.hackerrank.solution.practice.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 * @author leon.wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-comparator/problem
 */
class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		if(p2.score == p1.score) {
			return p1.name.compareTo(p2.name);
		}else {
			return p2.score > p1.score? 1 : -1;
		}
	}

	
}

class Player{
    public String name;
    public int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    
}

public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
