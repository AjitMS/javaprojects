package com.basic;

import com.basic.utilities.BasicUtilities;
import java.util.Scanner;

/**
 * @author Ajit Shikalgar
 *
 */
public class Powerof2 {

	/**
	 * @param args
	 * function to calculate power of 2 of input number.
	 * 
	 */
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		int exponential, value;

		System.out.println("**Power of 2 Program**");
				String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Number");
			exponential = t.nextInt();
			while (exponential >= 32) {
				System.out.println("Enter Number must be less than 32");
				exponential = t.nextInt();
			}
			value = BasicUtilities.powerOf2(exponential);
			System.out.println(value);
			System.out.println("Continue Y or N?");
			choice = t.next();
		}
		t.close();
	}

}
