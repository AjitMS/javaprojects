package com.basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Ajit Shikalgar
 *
 */
public class Palindrome {


	/**
	 * @param args
	 * To inspect whether a given string is palindrome 
	 * by populating it into deque
	 * using its feature of peekFirst() and peekLast()
	 */
	public static void main(String[] args) {
		String key;
		char array[];
		Scanner t = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			Deque<Character> dq = new ArrayDeque<>();
			System.out.println("Enter a String");
			key = t.nextLine();
			key = key.trim();
			array = new char[key.length()];
			array = key.toCharArray();
			for (int i = 0; i < array.length; i++)
				dq.addFirst(array[i]);

			System.out.println("Given String is ");
			System.out.print("[");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				System.out.print(", ");
			}
			System.out.println("]");
			System.out.println("and its Reverse is " + dq);

			while (!dq.isEmpty()) {
				try {
					if (dq.peekFirst() == dq.peekLast())  //Actual Comparision

					{
						dq.poll();
						dq.removeLast();
					} else {
						System.out.println(key + " is not a Palindrome");
						break;
					}

				} catch (NoSuchElementException E) {
					System.out.println("Reached center element");
				}
			}

			if (dq.isEmpty()) {
				System.out.println("Given String is Palindrome");
			}
		}
		t.close();
	}
}
