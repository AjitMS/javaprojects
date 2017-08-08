package com.basic.hashFunction;

import java.util.*;
import java.io.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class HashFunctionPopulator {
	// the path where our feeder file is present
	private String filePath = "src/textfiles/hashfeed.txt";
	private File file = new File(filePath);

	HashFunctionManager hashfunctionmanager = new HashFunctionManager();

	// intermediate holder for our numbers
	String[] tempArray;

	// our main logic
	Map<Integer, List<Integer>> myHashMap = new TreeMap<Integer, List<Integer>>();

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * method to populate the map with the contents in the file.(keys)
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		HashFunctionPopulator hashpop = new HashFunctionPopulator();

		// read the text file and store the no's into an array
		try {
			hashpop.read();
		} catch (Exception E) {
			System.out.println("Exception while Read");
		}
		// populate our map
		try {
			hashpop.populate();
		} catch (Exception E) {
			System.out.println("Exception while populating data");
			E.printStackTrace();
		}
		// save our file as a Serialized Object

	}

	/**
	 * @throws IOException
	 * populate our array from the file
	 */
	private void read() throws IOException {

		
		try (BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(file)))) {
			String line = br.readLine();
			tempArray = line.split(" ");
		}

	}

	/**
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * traverse our tempArray and keep populating our Map
	 */
	private void populate() throws FileNotFoundException, ClassNotFoundException, IOException {

		 
		for (String string : tempArray) {

			int key = Integer.parseInt(string);

			hashfunctionmanager.insert(key);

		}

	}

}