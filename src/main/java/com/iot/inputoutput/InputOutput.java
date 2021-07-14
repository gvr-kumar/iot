package com.iot.inputoutput;

/**
 * 
 * @author gangineni
 * 
 * IO (Input/Output): 
 * 
 *  Input Stream: how we read data from the source into the JVM at runtime.
 *  
 *  Output Stream: how we write data to the destination out of JVM at runtime.
 *  
 *  This reading and writing can be done in 2 basic formats
 *  
 *  i) byte stream
 *  ii) character stream
 *
 *	Input stream outputs the data to the application or JVM.
 *
 *	Output stream takes the data as input from the application or JVM and outputs to the destination.
 *
 *	basic streams in java are 
 *
 *	a)java.io.inputstream and b) java.io.outputstream
 *
 *	all byte based streams are called Streams.
 *
 *	all characters based streams are called readers/ writers.
 *
 *	Chaining of streams: Combining multiple streams (taking output of one stream as input to another stream).
 *
 *	Blocking IO streams: byte array input stream, file input stream, object input stream, 
 *
 *	NIO streams (Non-blocking IO):
 *
 *	Basic input stream: system.in which is used to read data into the program
 *
 *	Basic output stream: system.out which is used to write data to the console
 *
 *	Basic error stream: system.err which is used to print errors in the console
 */

public class InputOutput {
	
	public static void main(String[] args) {
		int a,b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		if(b == 0)
		{
			System.err.println("b cannot be zero");
			System.out.println("b cannot be zero");
		}
		else
		{
			c = a/b;
		}
	}

}
