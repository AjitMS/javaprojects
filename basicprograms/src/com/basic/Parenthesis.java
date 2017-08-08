package com.basic;

import java.util.*;

public class Parenthesis {
	int tos, length, size;
	char array[];

	/**
	 * @param n
	 *            Constructor working as a setter of initial values.
	 */
	public Parenthesis(int n) {
		tos = -1;
		length = 0;
		size = n;
		array = new char[n];
	}

	public char tos() {
		return array[tos];
	}

	/**
	 * @param data
	 *            A Method needed to push data into stack
	 */
	public void push(char data) {
		if (tos < size - 1) {
			length++;
			tos++;
			array[tos] = data;
			System.out.println("Array[tos]" + array[tos]);
		} else if (tos >= size - 1) {
			throw new IndexOutOfBoundsException("Stack Overflow");
		}
	}

	/**
	 * @param c
	 * @return boolean To check whether a character is present in stack or not
	 */
	public boolean hasChar(char c) {
		int temp = tos;
		for (int i = 0; i < array.length; i++)
			if (c == array[temp])
				return false;
		return true;
	}

	/**
	 * Function returning whether Stack is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (tos == -1)
			return true;
		return false;
	}

	/**
	 * Pop function to remove element on index.
	 */
	public void pop() {
		if (tos == -1) {
			System.out.println("Already Empty");
			return;
		} else {
			System.out.println("Popped out " + array[tos]);
			length--;
			tos--;
			return;

		}
	}



	/**
	 * Display Stack
	 */
	public void show() {
		for(int i =0; i<tos; i++)
		System.out.println(array[tos]);
	}

	/**
	 * @param args
	 * @throws Exception
	 * Driver pogram to implement stack into inspecting parenthesis
	 * 
	 */
	public static void main(String[] args) throws Exception {

		int countPush = 0, countPop=0;
		Scanner t = new Scanner(System.in);
		char character;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an Arithmetic Expression ");
			String sample = t.next();
			Parenthesis pr = new Parenthesis(100);
			for (int i = 0; i < sample.length(); i++) {
				character = sample.charAt(i);
				if (character == '{' || character == '(' || character == '[') {
					pr.push(character);
					countPush++;
				}

				if (character == '}' || character == ')' || character == ']') {
					pr.pop();
					countPop++;
				}
			}

			if (pr.isEmpty() && (countPop == countPush))
				System.out.println("Balanced Parentheis ");
			else
				System.out.println("Unbalanced Paranthesis ");
			System.out.println("Continue Y or N ?");
			choice = t.next();
		}
		
		t.close();
	}

}
