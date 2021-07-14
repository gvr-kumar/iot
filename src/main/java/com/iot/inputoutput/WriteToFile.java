package com.iot.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WriteToFile {
	
	public static void main(String[] args) {
		
		/**
		 * byte streams are always fast and accurate compared to character readers
		 * byte streams will give complete content where as character streams cannot read unidentified characters 
		 * etc like characters in encoding formats.
		 */
		
		try {

			FileReader filRdr = new FileReader(
					"//Users//gangineni//Documents//JavaProjects//iot//IOFiles//ReadTextFile");
			FileWriter filWrtr = new FileWriter(
					"//Users//gangineni//Documents//JavaProjects//iot//IOFiles//WriteTextFile");

			
			
			int i;
			int counter = 0;
			long diff;
			Date d1 = new Date();
			System.out.println(d1);

			while ((i = filRdr.read()) != -1) {
				System.out.println((char) i);
				//filWrtr.write((char) i); 
				counter++;

			}
			Date d2 = new Date();
			System.out.println(d2);

			diff = d2.getTime() - d1.getTime(); // getTime is epoch time nothing but UTC

			System.out.println(d2.getTime());
			System.out.println(d1.getTime());

			
			System.out.println(diff);
			System.out.println(counter);

			filWrtr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		/*
		 * try { FileReader filRdr = new FileReader(
		 * "//Users//gangineni//Documents//JavaProjects//iot//IOFiles//ReadTextFile");
		 * FileWriter fw = new FileWriter(
		 * "//Users//gangineni//Documents//JavaProjects//iot//IOFiles//WriteTextFile");
		 * 
		 * int i;
		 * 
		 * while ((i = filRdr.read()) != -1) { System.out.println((char) i);
		 * fw.write((char) i); }
		 * 
		 * fw.close(); } catch (Exception e) { System.out.println(e); }
		 */

	}

}
