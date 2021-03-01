package com.iot.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iot.hashing.Book;

public class BooksUtil {
	
	static 
	
	Map<BooksPojo, List<BooksPojo>> booksRepo = new HashMap<BooksPojo, List<BooksPojo>>();
	
	public void addBooksToRepo(BooksPojo bkObj)
	{
		List<BooksPojo> bksLst = booksRepo.get(bkObj);
		
		if(bksLst == null)
		{
			bksLst = new ArrayList<BooksPojo>();
		}
		bksLst.add(bkObj);
		booksRepo.put(bkObj, bksLst);
	}
	
	public void checkOutBook()
	{
		
	}
	
	public void displayBooks()
	{
		Set<BooksPojo> bksKeys = new HashSet<BooksPojo>();
		bksKeys = booksRepo.keySet();
		
		Iterator<BooksPojo> itr = bksKeys.iterator();
		
		while(itr.hasNext())
		{
			BooksPojo book = itr.next();
			System.out.println(book);			
		}
	}

}
