package com.basic;

import java.io.*;

/**
 * @author Ajit Shikalgar
 *
 */
class HelloUsername {
	/**
	 * @param args
	 * @throws IOException
	 * Hello <<UserName>> Program. taking username from user and display.
	 */
	public static void main(String args[]) throws IOException {
		String name = null;
		String template = "Hello";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("**This is HELLO <<USERNAME>> Program 01**");
		System.out.println(" ");
		System.out.println("Enter Username");

		name = br.readLine();
		while (name.length() <= 3) {
			System.out.println("Invalid Operation. Enter more than 3 characters");
			name = br.readLine();
		}
		System.out.println(template + " " + name);
	}
}
