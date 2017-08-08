package com.basic.hashFunction;

import java.util.*;
import java.io.*;

public class HashFunctionSerializer {

	public String filePath = "src/textfiles/hashop.dat";

	/**
	 * @param map
	 * @throws Exception
	 * to serialize entire map into object
	 */
	public void serialize(Map<Integer, List<Integer>> map) throws FileNotFoundException, IOException {
		HashFun myhash = new HashFun(map);
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("src/textfiles/hashop.dat"))) {
			out.writeObject(myhash);
		}
	}

	public Map<Integer, List<Integer>> deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"src/textfiles/hashop.dat"))) {
			
			HashFun hashfunction = (HashFun)in.readObject();
			Map<Integer, List<Integer>> map = hashfunction.getHashfunction();
			return map;
			}

	}
	
	


}