package com.iot.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	public void removeBook(Book bkObj)
	{
		List<Book> bksLst = bookHashMp.get(bkObj.getBookGenre());	
		
		if(bksLst != null)
		{			
		//bookHashMp.get(bkObj.getBookGenre()).remove(bkObj.getBookTitle());
			
			/*for (int i = 0; i<bksLst.size(); i++)
			{
				if (bksLst.get(i).getBookTitle().equalsIgnoreCase(bkObj.getBookTitle()))
				{
					bksLst.remove(i);
					bookHashMp.put(bkObj.getBookGenre(), bksLst);
					break;
				}
			}*/
			
			Iterator<Book> itr = bksLst.iterator();
			
			while (itr.hasNext())
			{
				Book b = itr.next();
				if (b.getBookTitle().equalsIgnoreCase(bkObj.getBookTitle()))
				{
					bksLst.remove(b);
					bookHashMp.put(bkObj.getBookGenre(), bksLst);
					break;
				}
			}
			
	    }
		
	}
	
	public void updateBook(Book bkObj)
	{
       List<Book> bksLst = bookHashMp.get(bkObj.getBookGenre());	
		
		if(bksLst != null)
		{		
			Iterator<Book> itr = bksLst.iterator();
			
			while (itr.hasNext())
			{
				Book b = itr.next();
				if (b.getBookTitle().equalsIgnoreCase(bkObj.getBookTitle()))
				{
					b.setBookTitle("ToKillMockingBird");
					
					bookHashMp.put(bkObj.getBookGenre(), bksLst);
					break;
				}
			}
			
			
		//bookHashMp.get(bkObj.getBookGenre()).remove(bkObj.getBookTitle());
		//bookHashMp.put(bkObj.getBookGenre(), bookHashMp.get(bkObj.getBookGenre() + 1)); 
	    }
	
	}
	
	public void searchBook(String genre, String bookTitle)
	{
      List<Book> bksLst = bookHashMp.get(genre);
		
		if(bksLst != null)
		{		
			Iterator<Book> itr = bksLst.iterator();
			
			while (itr.hasNext())
			{
				Book b = itr.next();
				if (b.getBookTitle().equalsIgnoreCase(bookTitle))
				{
					System.out.println(b.getBookTitle() + "Book Found");					
					break;
				}
			}
		}
				
	 }
	
	public int getCount(String genre)
	{
		 List<Book> bksLst = bookHashMp.get(genre);
		 
		 if (bksLst != null) 
		 {
			 return bksLst.size();
		 }
		 return 0;
	}
	
	public void printTitles(String genre)
	{
       List<Book> bksLst = bookHashMp.get(genre);	
		
		if(bksLst != null)
		{			
		Iterator<Book> itr = bksLst.iterator();
		
		while (itr.hasNext())
		{					
				
			    System.out.println(itr.next().getBookTitle());
		}
	}
		
		
	}	
	//Add, Remove, update, search, getCount 
}
