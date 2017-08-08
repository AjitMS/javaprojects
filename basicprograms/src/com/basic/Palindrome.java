package com.basic;

import java.util.*;

public class Palindrome {

	/**
	 * @author Ajit Shikalgar
	 * @param String
	 * Program com
	 */
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter no. of chars in String ");
		int n = t.nextInt();
		String temp;
		String s[] = new String[n];
		System.out.println("Enter each character of string ");
		for (int i = 0; i < s.length; i++)
			s[i] = t.next();

		Deque<String> dq = new ArrayDeque<String>();
		for (int i = 0; i < s.length; i++) {
			temp = s[i];
			dq.addLast(temp);
		}
		System.out.println("Deque is "+dq);

		for (int i = 0; i < s.length; i++)
			if (dq.peekLast().equals(s[i]))
				dq.pollLast();

		System.out.println("Deque is "+dq);
		
		if (dq.isEmpty() == true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		t.close();
	}
}
