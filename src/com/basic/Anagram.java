package com.basic;

import java.util.Scanner;
import com.basic.utilities.BasicUtilities;

/**
 * @author Ajit Shikalgar
 *
 */
public class Anagram {

	/**
	 * @param args
	 *            A Simple program to implement Anagram (if String is comes to be
	 *            equal to another string after certain combinations, then 2 strings
	 *            are said to be anagram of each other
	 */
	public static void main(String args[]) {
		String string1, string2;

		System.out.println("**Anagram Program 11**");

		Scanner scanner = new Scanner(System.in);
		boolean result;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter 1st String");
			string1 = scanner.nextLine();

			System.out.println("Enter 2nd String");
			string2 = scanner.nextLine();
			result = BasicUtilities.anagram(string1, string2);
			if (result == true)// INCLUDE SPACING
				System.out.println("Given Strings " + string1 + " and " + string2 + " are Anagram of each other");
			else
				System.out.println("Not an Anagram");

			System.out.println("Continue Y or N ?");
			choice = scanner.nextLine();

		}
		scanner.close();

	}

}
