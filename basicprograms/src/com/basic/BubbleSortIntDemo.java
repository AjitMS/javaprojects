package com.basic;

import java.util.*;

import com.basic.utilities.SortingUtilities;

/**
 * @author Ajit Shikalgar
 *
 */
public class BubbleSortIntDemo {

	/**
	 * @param array[],
	 *           temp, iterators Bubble sort for Integers
	 *           program to implement bubble sort for integers
	 */
	public static void main(String[] args) {

		int n, numbers[], i;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter no. of Integers");
		n = t.nextInt();
		numbers = new int[n];
		System.out.println("Enter " + n + " Integers");
		for (i = 0; i < n; i++)
			numbers[i] = t.nextInt();
		System.out.println("Given numbers are: ");
		for (i = 0; i < n; i++)
			System.out.println(numbers[i]);
		SortingUtilities.bubbleSortInt(numbers, n);

		t.close();

	}
}
