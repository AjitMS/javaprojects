package com.basic;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Ajit Shikalgar
 *
 */
public class Array2D {

	/**
	 * @param args
	 *            simple program to implement 2D Array.
	 */
	public static void main(String args[]) {

		System.out.println("**2-D Array Program 9**");

		Scanner scanner = new Scanner(System.in);
		int rows, columns;
		System.out.println("Enter no. of rows");
		rows = scanner.nextInt();
		System.out.println("Enter no. of columns");
		columns = scanner.nextInt();
		int array[][] = new int[rows][columns];
		System.out.println("Enter values of array");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = scanner.nextInt();

		PrintWriter printWriter = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			printWriter.println(" \n ");
			for (int j = 0; j < columns; j++)
				printWriter.print(array[i][j] + "\t");
		}

		printWriter.flush();
		printWriter.close();
		scanner.close();
	}
}
