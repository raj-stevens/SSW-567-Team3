// Prudhvi Raj Nemarugumulla
// Assignment1: Testing Input data

import java.io.*;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class C6
    {
    public static void main(String[] args) 
       {
        
        Scanner sc = new Scanner(System.in);
        int length,width,depth_shallow,depth_deep;
        
	// Testing Length of pool for Non Integers;
        do {
        System.out.println("Please enter a positive number for length");
        while (!sc.hasNextInt()) {
        System.out.println("Illegal input, That's not a number! Enter Again");
        sc.next(); 
        }
        length = sc.nextInt();
    	} while (length <= 0);
 
 
	// Testing Width of pool for Non Integers;
         do {
        System.out.println("Please enter a positive number for width");
        while (!sc.hasNextInt()) {
        System.out.println("Illegal input, That's not a number! Enter Again");
        sc.next(); 
        }
        width = sc.nextInt();
    	} while (width <= 0);


	// Testing Depth of pool shallow end for Non Integers;
         do {
        System.out.println("Please enter a positive number for depth shallow end");
        while (!sc.hasNextInt()) {
        System.out.println("Illegal input, That's not a number! Enter Again");
        sc.next(); 
        }
        depth_shallow = sc.nextInt();
    	} while (depth_shallow <= 0);


	// Testing Depth of pool deep end for Non Integers;
        do {
        System.out.println("Please enter a positive number for depth deep end");
        while (!sc.hasNextInt()) {
        System.out.println("Illegal input, That's not a number! Enter Again");
        sc.next(); 
        }
        depth_deep = sc.nextInt();
    	} while (depth_deep <= 0);

	System.out.println("Enter text string for customer name");
	String name=(sc.next());
	
	System.out.println("Is Entered customer name is a Text string : " + name.matches(".*[A-Za-z].*"));
	System.out.println("\nLength of the pool in feet " + length);
	System.out.println("\nWidth of the pool in feet " + width);
	System.out.println("\nDepth of the pool at the shallow end in feet " + depth_shallow);
	System.out.println("\nDepth of the pool at the deep end in feet " + depth_deep);
	
    }
}
