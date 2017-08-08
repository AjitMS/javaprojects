package com.basic.utilities;

public class BasicUtilities {

	public static boolean anagram(String a, String b) {
		int i, j;
		a = a.replaceAll("//s", "");
		b = b.replaceAll("//s", "");
		for (i = 0; i < a.length(); i++)
			for (j = 0; j < b.length(); j++) {
				if (a.length() == 0 || b.length() == 0)
					return false;
				if (a.charAt(i) != b.charAt(j) && a.length() != b.length())
					return false;
			}
		return true;
	}

	public static int powerOf2(int x) {
		if (x == 0)
			return 1;
		if (x == 1)
			return 2;
		return 2 * powerOf2(x - 1);
	}
	
	public static boolean isPrime(int x) {
		int count = 0;
		for (int j = 1; j < x; j++)
			if (x % j == 0)
				count++;
		if (count == 1)
			return true;
		return false;
	}
	
}
