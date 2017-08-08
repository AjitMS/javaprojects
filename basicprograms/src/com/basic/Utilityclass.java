package com.basic;




public class Utilityclass {
	static long start, stop, elapsed;

	/**
	 * @author Ajit
	 * @param array
	 * @param key
	 * driver function for the static methods
	 */
	public static void main(String[] args) {
		int array[] = { 91, 49, 73, 98, 02, 13, 10, 69, 22, 97 };
		int key = 91;
		String string[] = { "ajit", "sajid", "manoj", "mayur", "shahrukh",
				"akshay", "ras" };
		String keyword = "mayur";
		int lengthint = array.length;
		int lengthstr = string.length;
		long a[] = new long[7];
		a[1] = binarySearchInt(array, key);
		a[2] = binarySearchString(string, keyword);
		a[3] = insertionSortInt(array, lengthint);
		a[4] = insertionSortString(string, lengthstr);//String and No. of Words
		a[5] = bubbleSortInt(array, lengthint);
		a[6] = bubbleSortString(string, lengthstr);
		for (int i = 1; i < a.length; i++)
			System.out.println(a[i]);
	}

	/**
	 * @param array a
	 * @param array length
	 * search and print desired int
	 * @return overhead plus processing time
	 */
	public static long binarySearchInt(int a[], int b) {
		long time;
		startTime();
		int first = 0;
		int last = a.length - 1;
		int middle;

		System.out.println("***BinarySearchint: ***");
		while (first <= last) {
			middle = (first + last) / 2;
			if (b == a[middle]) {
				System.out.println("Searched numer " + b + " is found at "
						+ (middle + 1));
				break;
			} else if (b > a[middle])
				last = middle - 1;
			else if (b < a[middle])
				first = middle + 1;
			else
				System.out.println("Number Not Found");
		}
		time = stopTime();
		return time;
	}

	/**
	 * @param String a[]
	 * @param String length
	 * Binary search for string
	 * @return method execution time
	 */
	public static long binarySearchString(String a[], String b) {
		System.out.println("binarysearchstring: ");
		startTime();
		int first = 0, last = a.length - 1, middle;
		while (first <= last) {
			middle = (first + last) / 2;
			if (b.equals(a[middle])) {
				System.out.println("Found the Keyword " + b + " at "
						+ (middle + 1) + " location");
				break;
			} else if (b.compareTo(a[middle]) > 0)
				last = middle;
			else if (b.compareTo(a[middle]) < 0)
				first = middle;
			else
				System.out.println("Keyword not found");
			stopTime();
		}
		long time;
		time = stopTime();
		return time;
	}

	/**
	 * @param array a
	 * @param array length
	 * @return method execution time
	 */
	public static long insertionSortInt(int a[], int b) {
		startTime();
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
		long time;
		time = stopTime();

		return time;
	}

	/**
	 * @param String array
	 * @param string length
	 * insertion sort for Strings
	 * @return method execution time
	 */
	public static long insertionSortString(String a[], int b) {
		startTime();
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
		long time;
		time = stopTime();

		return time;
	}

	/**
	 * @param integer array
	 * @param array length
	 * Bubble sort for Integer
	 * @return method execution time
	 */
	public static long bubbleSortInt(int a[], int b) {
		startTime();
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
			System.out.println(a[i]);
		long time;
		time = stopTime();

		return time;
	}

	/**
	 * @param string array
	 * @param string length
	 * bubble sort for string
	 * @return method execution time
	 */
	public static long bubbleSortString(String a[], int b) {
		System.out.println("bubblesortstring: ");
		startTime();
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
		long time;
		time = stopTime();

		return time;
	}

	/**
	 * static Method for capturing start time
	 */
	public static void startTime() {
		start = System.nanoTime();
		System.out.println("START TIME IS: " + start);
	}

	/**
	 * @elapsed time: time period between stop and start
	 */
	public static long stopTime() {
		stop = System.nanoTime();
		elapsed = (stop - start);
		return elapsed;
	}
}