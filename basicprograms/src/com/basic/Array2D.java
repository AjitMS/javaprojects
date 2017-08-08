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
	 * simple program to implement 2D Array.
	 */
	public static void main(String args[]) {

		System.out.println("**2-D Array Program 9**");

		Scanner t = new Scanner(System.in);
		int rows, columns, i, j;
		System.out.println("Enter no. of rows");
		rows = t.nextInt();
		System.out.println("Enter no. of columns");
		columns = t.nextInt();
		int array[][] = new int[rows][columns];
		System.out.println("Enter values of array");
		for (i = 0; i < rows; i++)
			for (j = 0; j < columns; j++)
				array[i][j] = t.nextInt();

		PrintWriter printwriter = new PrintWriter(System.out);

		for (i = 0; i < rows; i++) {
			printwriter.println(" \n ");
			for (j = 0; j < columns; j++)
				printwriter.print(array[i][j] + "\t");
		}

		printwriter.flush();
		printwriter.close();
		t.close();
	}
}
