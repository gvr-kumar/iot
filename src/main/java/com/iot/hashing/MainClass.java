package com.iot.hashing;


public class MainClass {
	
	public static void main(String[] args) {
		
		Book lifeOfPi = new Book("Action and Adventure", "Life of Pi", "Yann Martel", 8.99f);
		Book threeMusk = new Book("Action and Adventure", "The Three Musketeers", "Alexandre Dumas", 14.99f);
		Book theCallOfWild = new Book("Action and Adventure", "The Call of the Wild", "Jack London", 5.99f);
		
		Book toKillMockBird = new Book("Classics", "To Kill a Mockingbird", "Harper Lee", 7.19f);
		Book littlWomen = new Book("Classics", "Little Women", "Louisa May Alcott", 14.96f);
		Book beLoved = new Book("Classics", "Beloved", "Toni Morrison", 12.19f);

		
		LibraryService libserv = new LibraryService();
		
		libserv.addBookToGenre(lifeOfPi);
		libserv.addBookToGenre(threeMusk);
		libserv.addBookToGenre(theCallOfWild);
		libserv.addBookToGenre(toKillMockBird);
		libserv.addBookToGenre(littlWomen);
		libserv.addBookToGenre(beLoved);
		
		System.out.println(libserv.getCount("Classics"));
	     libserv.printTitles("Classics");
		
		//libserv.removeBook(toKillMockBird);
		
	     libserv.updateBook(toKillMockBird);
		
		System.out.println(libserv.getCount("Classics"));
		libserv.printTitles("Classics");
		
		libserv.searchBook("Classics","Beloved");
		
		//HashMap<String, Book> 
		
				
	
	}

}
