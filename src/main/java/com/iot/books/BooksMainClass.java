package com.iot.books;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.iot.enums.BookStatus;

public class BooksMainClass {

	public static void main(String[] args) {
		
		BooksPojo javaComplRef1 = new BooksPojo("Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.AVAILABLE, "2021-01-01", 25.25f);
		
		BooksPojo javaComplRef2 = new BooksPojo("Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.CHECKEDOUT, "2021-01-01", 25.25f);
		
		BooksPojo javaComplRef3 = new BooksPojo("Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.AVAILABLE, "2021-06-01", 30.50f);
		
		BooksPojo javaComplRef4 = new BooksPojo("Java The Complete Reference", "Herbert Schildt", "Computer Science", BookStatus.AVAILABLE, "2021-01-01", 25.25f);
		
		
		
		BooksUtil bksUtil = new BooksUtil();
		
		bksUtil.addBooksToRepo(javaComplRef1);
		bksUtil.addBooksToRepo(javaComplRef2);
		bksUtil.addBooksToRepo(javaComplRef3);
		bksUtil.addBooksToRepo(javaComplRef4);
		
		bksUtil.displayBooks();
		
		

	}

}
