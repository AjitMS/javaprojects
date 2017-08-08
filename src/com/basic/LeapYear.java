package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
class LeapYear {
	/**
	 * @param year
	 *            Accepting a number as year, and return whether it is leap year or
	 *            not calculate mod 4
	 * 
	 */
	public static void main(String args[]) {
		System.out.println("**Leap Year Program 3**");
		String choice = "y";
		int yearInt;
		String year = null;
		Scanner scanner = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the Year");
			year = scanner.nextLine();
			while (year.length() != 4) {
				System.out.println("Enter only a 4 digit Year");
				year = scanner.nextLine();
			}
			yearInt = Integer.parseInt(year);
			if (yearInt % 4 == 0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
			System.out.println("continue Y or N ? ");
			choice = scanner.next();
		}
		scanner.close();
	}
}