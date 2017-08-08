package com.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class gson {

	public static void main(String args[]) throws IOException {

		String path = "src/textfiles/Sample.json";
		String a= "HELLLO";
				String b = "hello";;
		 try(Writer writer = new OutputStreamWriter(new FileOutputStream(path) , "UTF-8")){
	            Gson gson = new GsonBuilder().create();
	            gson.toJson(a, writer);
	            gson.toJson(b, writer);
		
		
		
		 
		 }

	}
}
