package com.basic.hashFunction;

import java.util.*;
import java.io.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class HashFunctionSerializer {

	public String filePath = "src/textfiles/hashop.dat";

	/**
	 * @param map
	 * @throws Exception
	 * to serialize entire map into object
	 */
	public void serialize(Map<Integer, List<Integer>> map) throws FileNotFoundException, IOException {
		HashFunction myhash = new HashFunction(map);
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("src/textfiles/hashop.dat"))) {
			out.writeObject(myhash);
		}
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * method needed to return deserialized map
	 */
	public Map<Integer, List<Integer>> deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"src/textfiles/hashop.dat"))) {
			
			HashFunction hashfunction = (HashFunction)in.readObject();
			Map<Integer, List<Integer>> map = hashfunction.getHashfunction();
			return map;
			}

	}
	
	


}