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
		int i;
		Scanner scanner = new Scanner(System.in);
		Scanner fileScanner = new Scanner(new FileReader("src/textfiles/text.txt"));

		List<String> st = new ArrayList<String>();
		while (fileScanner.hasNext())
			st.add(fileScanner.next());
		String[] s = new String[(st.size())];
		Collections.sort(st);
		Iterator<String> l = st.listIterator();

		i = 0;
		while (l.hasNext()) {
			s[i] = (String) l.next();
			i++;
		}
		for (i = 0; i < s.length; i++)
			System.out.println(s[i]);

		System.out.println("Enter a String to search");
		String name = scanner.next();

		SortingUtilities.binarySearchString(s, name);
		scanner.close();
		fileScanner.close();

	}
}
