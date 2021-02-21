package com.iot.books;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.iot.enums.BookStatus;

public class BooksMainClass {

	public static void main(String[] args) {
		
		BooksPojo javaComplRef10 = new BooksPojo("J1", "Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.AVAILABLE, "2021-01-01", 25.25f);
		BooksPojo javaComplRef11 = new BooksPojo("J2", "Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.CHECKEDOUT, "2021-01-01", 25.25f);
		
		BooksUtil bksUtil = new BooksUtil();
		
		

	}

}
