package com.basic.hashFunction;



import java.util.*;
import java.io.*;

public class HashFunctionPopulator {
	// the path where our feeder file is present
	private String filePath = "src/textfiles/hashfeed.txt";
	private File file = new File(filePath);

	HashFunctionManager hashfunctionmanager = new HashFunctionManager();

	// intermediate holder for our numbers
	String[] noArray;

	// our main game
	Map<Integer, List<Integer>> myHashMap = new TreeMap<Integer, List<Integer>>();

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

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
			System.out.println("Exception while populating your data");
		}
		// save our file as a Serialized Object

	}

	private void read() throws IOException {

		// populate our array from the file
		try (BufferedReader br = new BufferedReader(new BufferedReader(
				new FileReader(file)))) {
			String str = br.readLine();
			noArray = str.split(" ");
		}

	}

	private void populate() throws FileNotFoundException,
			ClassNotFoundException, IOException {

		// traverse our noArray and keep populating our Map
		for (String string : noArray) {

			int n = Integer.parseInt(string);

			hashfunctionmanager.insert(n);

		}

	}

}