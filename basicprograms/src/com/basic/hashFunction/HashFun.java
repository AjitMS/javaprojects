package com.basic.hashFunction;

import java.util.*;
import java.io.*;


public class HashFun implements Serializable {

	private static final long serialVersionUID = 1L;
	private TreeMap<Integer, List<Integer>> hashfunction;
	
	public HashFun(Map<Integer, List<Integer>> map){
		hashfunction = (TreeMap<Integer, List<Integer>>)map;
	}
	
	public TreeMap<Integer, List<Integer>> getHashfunction(){
		return hashfunction;
	}
	

}