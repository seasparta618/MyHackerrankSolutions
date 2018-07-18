package au.leon.hackerrank.solution.practice30days;

import java.util.*;
import java.io.*;
/**
 * 
 * @author leon.wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> contactMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contactMap.put(name, phone);
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            System.out.println(contactMap.get(name)==null?"Not Found":(name+" "+contactMap.get(name)));
        }
        in.close();
    }
}