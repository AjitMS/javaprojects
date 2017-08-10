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

		int capacity, numbers[], i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of Integers");
		capacity = scanner.nextInt();
		numbers = new int[capacity];
		System.out.println("Enter " + capacity + " Integers");
		for (i = 0; i < capacity; i++)
			numbers[i] = scanner.nextInt();
		System.out.println("Given numbers are: ");
		for (i = 0; i < capacity; i++)
			System.out.println(numbers[i]);
		SortingUtilities.bubbleSortInt(numbers, capacity);

		scanner.close();

	}
}
