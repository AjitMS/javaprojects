package com.basic.hashFunction;

import java.util.*;
import java.io.*;


/**
 * @author Ajit Shikalgar
 *
 */
public class HashFunction implements Serializable {

	private static final long serialVersionUID = 1L;
	private TreeMap<Integer, List<Integer>> hashfunction;
	
	/**
	 * @param map
	 * constructor to set map value
	 */
	public HashFunction(Map<Integer, List<Integer>> map){
		hashfunction = (TreeMap<Integer, List<Integer>>)map;
	}
	
	/**
	 * @return
	 * getter function to get map
	 */
	public TreeMap<Integer, List<Integer>> getHashfunction(){
		return hashfunction;
	}
	

}