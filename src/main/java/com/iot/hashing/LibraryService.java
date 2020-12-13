package com.iot.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibraryService {
	
	HashMap<String, List<Book>> bookHashMp = new HashMap<String, List<Book>>();
	
	
	public void addBookToGenre(Book bkObj)
	{
		List<Book> bksLst = bookHashMp.get(bkObj.getBookGenre());
		
		if(bksLst == null)
		{
			bksLst = new ArrayList<Book>();
		}
		bksLst.add(bkObj);
		bookHashMp.put(bkObj.getBookGenre(), bksLst);
		
	}

	
	//Add, Remove, update, search, getCount 
}
