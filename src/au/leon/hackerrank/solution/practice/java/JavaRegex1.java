package au.leon.hackerrank.solution.practice.java;
/**
 * 
 * @author leon.wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-regex/problem
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String subPattern = "(25[0-5]|2[0-4][0-9]|(0|1)[0-9][0-9]|[0-9][0-9]|[0-9])";
    public String pattern = subPattern + "." + subPattern + "." + subPattern + "." + subPattern;
}