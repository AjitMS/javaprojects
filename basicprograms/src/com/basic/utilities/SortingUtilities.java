package com.basic.utilities;

import java.util.Random;
import java.util.Scanner;

public class SortingUtilities {

	public static void binarySearchInt(int a[], int b) {

		int first = 0;
		int last = a.length - 1;
		int middle;

		/**
		 * @param array
		 *            a
		 * @param array
		 *            length search and print desired int
		 * @return overhead plus processing time
		 */
		System.out.println("***BinarySearchint: ***");
		while (first <= last) {
			middle = (first + last) / 2;
			if (b == a[middle]) {
				System.out.println("Searched numer " + b + " is found at " + (middle + 1));
				break;
			} else if (b > a[middle])
				last = middle - 1;
			else if (b < a[middle])
				first = middle + 1;
			else
				System.out.println("Number Not Found");
		}

	}

	/**
	 * @param String
	 *            a[]
	 * @param String
	 *            length Binary search for string
	 * @return method execution time
	 */
	public static void binarySearchString(String a[], String b) {
		int first = 0, last = a.length - 1, middle;
		while (first <= last) {

			middle = (last + first) / 2;

			if (b.equals(a[middle])) {
				System.out.println("Found the Keyword " + b + " at " + (middle + 1) + " location");
				break;
			} else if (b.compareTo(a[middle]) >= 0)
				first = middle + 1;
			else if (b.compareTo(a[middle]) <= 0)
				last = middle - 1;

			else
				System.out.println("Keyword not found");
		}

	}

	/**
	 * @param array
	 *            a
	 * @param array
	 *            length
	 * @return method execution time
	 */
	public static void insertionSortInt(int a[], int b) {
		System.out.println("insertionsortint: ");
		int i, j, key;
		for (i = 1; i < b; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		System.out.println("Sorted Numbers are: ");
		for (i = 0; i < b; i++)
			System.out.println(a[i]);

	}

	/**
	 * @param String
	 *            array
	 * @param string
	 *            length insertion sort for Strings
	 * @return method execution time
	 */
	public static void insertionSortString(String a[], int b) {
		System.out.println("insertionsortstring: ");
		int i, j;
		String key;
		for (i = 1; i < b; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j].compareTo(key) > 0) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		System.out.println("Sorted Keywords are: ");
		for (i = 0; i < b; i++)
			System.out.println(a[i]);
	}

	/**
	 * @param integer
	 *            array
	 * @param array
	 *            length Bubble sort for Integer
	 * @return method execution time
	 */
	public static void bubbleSortInt(int a[], int b) {
		System.out.println("bubblesortint: ");
		int i, j, temp;
		for (i = 0; i < b; i++)
			for (j = 0; j < b; j++)
				if (a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		System.out.println("Sorted Array is: ");
		for (i = 0; i < b; i++)
			System.out.print(a[i] + " ");
	}

	/**
	 * @param string
	 *            array
	 * @param string
	 *            length bubble sort for string
	 * @return method execution time
	 */
	public static void bubbleSortString(String a[], int b) {
		System.out.println("bubblesortstring: ");

		int i, j;
		String temp;
		for (i = 0; i < b; i++)
			for (j = 0; j < b; j++)
				if (a[j].compareTo(a[i]) > 1) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		System.out.println("Sorted Keywords are: ");
		for (i = 0; i < b; i++)
			System.out.println(a[i]);
	}

	/**
	 * method
	 */
	public static void generateCoupon() {
		int n, i;
		int array[];
		Scanner t = new Scanner(System.in);
		System.out.println("Enter No. of Distinct values you need");
		n = t.nextInt();
		array = new int[n];
		Random rm = new Random();
		System.out.println("The Initial Generated Values: ");
		for (i = 0; i < n; i++) {
			array[i] = rm.nextInt(100);
			System.out.print(array[i] + "\t");
		}
		int trials = n;
		while (!(isUnique(array))) {
			generateUnique(array, trials);
		}
		System.out.println("");
		System.out.println("Final Generated Values: ");

		bubbleSortInt(array, array.length);
		t.close();
	}

	public static int[] generateUnique(int array[], int trial) {
		Random rm = new Random();
		int temp;
		temp = rm.nextInt(1000);
		if (isUnique(array)) {
			System.out.println(" ");
			System.out.println("Total Trials: " + trial + " !");
			return array;
		} else {
			trial++;
			for (int i = 0; i < array.length; i++)
				if (temp == array[i])
					temp = rm.nextInt(100);
			for (int i = 0; i < array.length; i++)
				for (int j = i + 1; j < array.length; j++)
					if (array[i] == array[j]) {
						array[i] = temp;
						break;

					}
			return array = generateUnique(array, trial);
		}
	}

	public static boolean isUnique(int array[]) {
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j])
					return false;
		return true;
	}

}
