package com.basic;

import java.util.*;

import com.basic.utilities.SortingUtilities;

public class Insertionsortstring {

	/**
	 * @param args
	 *            Insertion Sort Implementation for Strings
	 */
	public static void main(String[] args) {

		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of words");
		int n = scanner.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the " + n + " words: ");
		for (i = 0; i < n; i++)
			s[i] = scanner.next();
		System.out.print("Unsorted list is ");
		for (i = 0; i < n; i++) {
			System.out.println(s[i]);
			System.out.print(" ");
		}
		
		
		SortingUtilities.insertionSortString(s,n);
		scanner.close();
	}

}
