package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class Triplets {

	/**
	 * Accept integers and return triplets such that sum of the contents in triplets sum to zero
	 */
	public static void main(String args[]) {

		System.out.println("**Triplets summed up to Zero Program**");

		int array[], n, i, j, k, count = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter no. of integers");
		n = t.nextInt();
		array = new int[n];
		System.out.println("Enter " + n + "Integers in array");
		for (i = 0; i < n; i++)
			array[i] = t.nextInt();
		for (i = 0; i < n; i++)
			for (j = i + 1; j < n; j++)
				for (k = j + 1; k < n; k++)
					if (array[i] + array[j] + array[k] == 0) {
						count++;
						System.out
								.println("The  Trio: " + count + " is" + array[i] + ", " + array[j] + ", " + array[k]);
					}
		System.out.println("Total Trio count is " + count);
		t.close();
	}
}
