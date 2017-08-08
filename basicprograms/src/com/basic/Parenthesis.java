package com.basic;

import java.util.*;

public class Parenthesis {
	int tos, length, size;
	char array[];

	/**
	 * @param n
	 * Constructor working as a setter of initial values.
	 */
	public Parenthesis(int n) {
		tos = -1;
		length = 0;
		size = n;
		array = new char[n];
	}

	/**
	 * @param data
	 * A Method needed to push data into stack
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
	 * @return boolean
	 * To check whether a character is present in stack or not
	 */
	public boolean haschar(char c) {
		int temp = tos;
		for (int i = 0; i < array.length; i++)
			if (c == array[temp])
				return false;
		return true;
	}

	/**
	 * Function returning whether Stack is empty or not.
	 * @return
	 */
	public boolean isempty() {
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
			length--;
			tos--;
			System.out.println("Array[tos] after pop" + array[tos]);
			return;

		}
	}

	public void show() {

		System.out.println(array[tos]);
	}

	public static void main(String[] args) throws Exception {

		Scanner t = new Scanner(System.in);
		char c;
		System.out.println("Enter an Arithmetic Expression ");
		String sample = t.nextLine();
		Parenthesis pr = new Parenthesis(100);
		for (int i = 0; i < sample.length(); i++) {
			c = sample.charAt(i);
			if (c == '{' || c == '(' || c == '[')
				pr.push(c);

			if (c == '}' || c == ')' || c == ']')
				pr.pop();

		}

		if (pr.isempty())
			System.out.println("Balanced Parentheis ");
		else
			System.out.println("Unbalanced Paranthesis ");
		t.close();

	}

}
