package com.basic.hashFunction;


import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ajit Shikalgar
 *
 */
public class HashFunctionManager {

	Map<Integer, List<Integer>> map;
	HashFunctionSerializer serializer = new HashFunctionSerializer();

	/**
	 * @param n
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * a method required to insert key and its corresponding data into map<int, list>
	 */
	public void insert(int n) throws FileNotFoundException,
			ClassNotFoundException, IOException {
		// Null Check

		// retrieve the map from serialized file

		// this is to handle empty file
		try {
		map = serializer.deserialize();
		}
		catch(EOFException E) {
			System.out.println("File Is Empty Initially !");
			map = new TreeMap<Integer, List<Integer>>();
		}

		

		// calculate key and check whether it is existing or not?
		int key = n % 11;
		// IF YES
		if (map.containsKey(key)) {
			List<Integer> list = map.get(key);
			// add more logic here to check if the value already exists in there
			// if yes then pop it else push it

			if (list.contains(n)) {
				System.out.println("Already Exists so popping");
				Integer autobox = n;
				list.remove(autobox);
				//NO NEED -> map.put(key, list);
			} else {
				list.add(n);

				//NO NEED -> map.put(key, list);
			}
		} else {
			// that means index not present. so adding.
			List<Integer> list = new ArrayList<Integer>();
			list.add(n);
			map.put(key, list); // -> Needed
		}
		// Now that we changed the map we must reflect it in Object file

		serializer.serialize(map);
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * getter function to get deserialized map
	 */
	public Map<Integer, List<Integer>> getmap() throws FileNotFoundException,
			ClassNotFoundException, IOException {
		return serializer.deserialize();

	}

}