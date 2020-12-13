package com.iot.hashing;

import java.util.ArrayList;
import java.util.List;

public class Genre {
	
	String bookGenre;
	
	List<Book> booksList = new ArrayList<Book>();

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

}
