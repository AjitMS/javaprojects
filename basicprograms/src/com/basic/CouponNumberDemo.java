package com.basic;

import java.util.Scanner;

import com.basic.utilities.SortingUtilities;

/**
 * @author Ajit Shikalgar
 *
 */

public class CouponNumberDemo {

	/**
	 * Generate n no. of whole numbers using random number generator. also pass the
	 * numbers through a function if not unique, replace it with another number
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			try {
				SortingUtilities.generateCoupon();
			} catch (StackOverflowError E) {
				System.out.println(" ");
				System.out.println("Enter a Smaller Number. Stack Overflow !");

			}
			System.out.println("Try Again Y or N?");
			choice = scanner.nextLine();
		}
		scanner.close();
	}
}
