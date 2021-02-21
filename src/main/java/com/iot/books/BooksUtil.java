package com.iot.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.iot.hashing.Book;

public class BooksUtil {
	Map<BooksPojo, List<BooksPojo>> booksRepo = new HashMap<BooksPojo, List<BooksPojo>>();
	
	public void addBooksToRepo(BooksPojo bkObj)
	{
		List<BooksPojo> bksLst = booksRepo.get(bkObj.getBookDept());
		
		if(bksLst == null)
		{
			bksLst = new ArrayList<BooksPojo>();
		}
		bksLst.add(bkObj);
		booksRepo.put(bkObj.getBookDept(), bksLst);
	}
	

}
