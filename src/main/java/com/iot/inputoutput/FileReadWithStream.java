package com.iot.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;


public class FileReadWithStream {
	public static void main(String[] args) {
		try
		{
			File  file1 = new File("//Users//gangineni//Documents//JavaProjects//iot//IOFiles//ReadTextFile");
			File  file2 = new File("//Users//gangineni//Documents//JavaProjects//iot//IOFiles//WriteTextFile");
			
			FileInputStream fIs = new FileInputStream(file1);
			FileOutputStream fOs = new FileOutputStream(file2);
			
			Date readTime1 = new Date();
			
			byte fileContent[] = new byte[(int)file1.length()];
			
			fIs.read(fileContent);
			
			
			String s = new String(fileContent);
			
			Date readTime2 = new Date();
			
			fOs.write(fileContent);
			
			Date writeTime2 = new Date();
			
			long readTime = readTime2.getTime() - readTime1.getTime();
			long writeTime = writeTime2.getTime() - readTime1.getTime();
			
			System.out.println(s);
			System.out.println(readTime);
			System.out.println(writeTime);
			fOs.close();
		}	
		catch(Exception e)
		{}		
	}
}
