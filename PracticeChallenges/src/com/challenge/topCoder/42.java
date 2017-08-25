package com.challenge.topCoder;

import java.io.*;
import java.util.*;

class p42 {
public static void main(String args[])throws IOException {

Scanner t = new Scanner(System.in);
int i;
while(true)
{
i = t.nextInt();


	if(i==42)
		break;
System.out.println(i);

}
t.close();
}
}