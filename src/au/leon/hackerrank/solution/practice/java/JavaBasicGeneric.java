/**
 * @author Leon Wang
 * @email seasparta618@gmail.com dev.leon618@gmail.com
 * @url 	
 */
package au.leon.hackerrank.solution.practice.java;


import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author leon wang
 * @Email seasparta618@gmail.com, dev.leon618@gmail.com
 * @url https://www.hackerrank.com/challenges/java-generics/problem
 */

class Printer
{
   //Write your code here
    public void printArray(Object[] objs){
        for(Object obj : objs){
            System.out.println(obj.toString());
        }
    }
 
}

public class JavaBasicGeneric {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}