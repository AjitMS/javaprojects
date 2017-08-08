package com.basic;

import java.util.*;
import java.util.regex.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class Regex {

	/**
	 * @param args
	 * Using pattern compiling and matching, replace given keyword by user credentials
	 */
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String line = "Hello <<name>>, We have your full name as <<full name>>"
				+ "in our system. your contact number is 91-xxxxxxxxxx."
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";

		String data[] = new String[4];
		System.out.println("Enter Name, Full Name, Mobile Number ");
		for (int i = 0; i < data.length - 1; i++)
			data[i] = t.nextLine();
		data[3] = "25/07/17";

		String pattern = "<<name>>";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if (m.find()) {

			line = line.replaceAll(pattern, data[0]);
		}

		pattern = "<<full name>>";
		r = Pattern.compile(pattern);
		m = r.matcher(line);
		if (m.find())
			line = line.replaceAll(pattern, data[1]);

		pattern = "91-xxxxxxxxxx";
		r = Pattern.compile(pattern);
		m = r.matcher(line);
		if (m.find())
			line = line.replace(pattern, data[2]);

		pattern = "01/01/2016";
		r = Pattern.compile(pattern);
		m = r.matcher(line);
		if (m.find())
			line = line.replace(pattern, data[3]);

		System.out.println(line);
		t.close();

	}
}