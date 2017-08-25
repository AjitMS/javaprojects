package com.challenge.topCoder;
import java.util.*;
import java.io.*;

class Enormous1 {
	public static void main(String args[]) throws IOException {
		Scanner t = new Scanner(System.in);
		int n, k, count = 0;
		n = t.nextInt();//capacity of array 1
		k = t.nextInt();//
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = t.nextInt();//array 1 populate
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % k == 0)
				count++;
		System.out.println(count);
		t.close();
	}
}