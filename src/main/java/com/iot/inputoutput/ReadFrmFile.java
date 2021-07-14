package com.iot.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFrmFile {
	//We cannot add throw and throws in main, we can also use try, catch

	public static void main(String[] args) {
		
		try {
			FileReader fileRdr = new FileReader("//Users//gangineni//Documents//JavaProjects//iot//IOFiles//ReadTextFile");
			
			
			int i;
			while((i = fileRdr.read()) != -1)
			{
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
