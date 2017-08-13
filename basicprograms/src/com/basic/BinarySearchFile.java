package com.basic;

import java.util.*;
import java.io.*;
import com.basic.utilities.SortingUtilities;

/**
 * @author Ajit Shikalgar
 *
 */
public class BinarySearchFile {

	/**
	 * @param head
	 * @param tail
	 * @param middle
	 * @throws FileNotFoundException
	 *             Function to read a file and search for a specific word by user.
	 */
	public static void main(String[] args) throws Exception {
		int iterator; String choice = "y";
		Scanner scanner = new Scanner(System.in);
		Scanner fileScanner = new Scanner(new FileReader("src/textfiles/text.txt"));

		List<String> st = new ArrayList<String>();
		while (fileScanner.hasNext())
			st.add(fileScanner.next());
		String[] s = new String[(st.size())];
		Collections.sort(st);
		Iterator<String> listIterator = st.listIterator();

		iterator = 0;
		while (listIterator.hasNext()) {
			s[iterator] = (String) listIterator.next();
			iterator++;
		}
		for (iterator = 0; iterator < s.length; iterator++)
			System.out.println(s[iterator]);
		while(choice.equalsIgnoreCase("y")) {
		System.out.println("Enter a String to search");
		String name = scanner.next();

		SortingUtilities.binarySearchString(s, name);
		System.out.println("Continue Y or N ?");
		choice = scanner.next();
		}
		scanner.close();
		fileScanner.close();

	}
}
