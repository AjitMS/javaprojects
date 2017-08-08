package com.basic;

import java.io.IOException;

public class StopWatch {


static long elapsed;
static char key;
static boolean click = false;
static long starttime;
static long stoptime;
public static void main(String args[]) throws IOException{

System.out.println("**Stopwatch Program 12**");

startwatch();
stopwatch();
elapsed = gettime();
System.out.println("Elapsed time was : "+elapsed);
}
public static void startwatch() throws IOException{
System.out.println("Press ENTER Key");
System.in.read();//PAUSE ADDITION
if(click == false)
click = true;
starttime = System.currentTimeMillis(); //Milliseconds
System.out.println("Start time : "+starttime);
}
public static void stopwatch() throws IOException{
System.out.println("Recording...");
System.in.read();
if(click == true)
click = false;
stoptime = System.currentTimeMillis();
System.out.println("Stop time : "+stoptime);
}
public static long gettime(){
return elapsed = (stoptime-starttime)/1000; //In Seconds
}
}