package com.basic;

import java.io.IOException;

/**
 * @author Ajit Shikalgar
 *
 */
public class StopWatch {

	static long elapsed;
	static char key;
	static boolean click = false;
	static long starttime;
	static long stoptime;

	public static void main(String args[]) throws IOException {

		System.out.println("**Stopwatch Program 12**");

		startWatch();
		stopWatch();
		elapsed = getTime();
		System.out.println("Elapsed time was : " + elapsed);
	}

	/**
	 * @throws IOException
	 * method to start recording time after user hits 'Enter' 
	 */
	public static void startWatch() throws IOException {
		System.out.println("Press ENTER Key");
		System.in.read();// PAUSE ADDITION
		if (click == false)
			click = true;
		starttime = System.currentTimeMillis(); // Milliseconds
		System.out.println("Start time : " + starttime);
	}

	
	/**
	 * @throws IOException
	 * method to stop recording after user hits 'Enter'
	 */
	public static void stopWatch() throws IOException {
		System.out.println("Recording...");
		System.in.read();
		if (click == true)
			click = false;
		stoptime = System.currentTimeMillis();
		System.out.println("Stop time : " + stoptime);
	}

	/**
	 * @return
	 * returns difference between start and stoptime as elapsed time
	 */
	public static long getTime() {
		return elapsed = (stoptime - starttime) / 1000; // In Seconds
	}
}