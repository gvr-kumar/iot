package com.iot.hashing;


public class MainClass {
	
	/**
	 * should be some way to do bucket identification.
	 * 
	 * 
	 * Hashing: hashing algorithm is applied on the keys of a hash map and also of a hash set and hash table..
	 * 
	 * Hashcode: hashcode is the memory offset () of the object by default. Hashcode method can be overridden.
	 * 
	 * every object has its own hash code.
	 * 
	 * 
	 * native implementation : the default hashcode value of an object 
	 * is based on the native implementation of the JVM of the OS (serialization and memory implementation)
	 * 
	 * programmatic implementation: hashcode method can be  overridden.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 2018699554
	 * 1311053135
	 * 
	 * Hashing: 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Book lifeOfPi = new Book("Action and Adventure", "Life of Pi", "Yann Martel", 8.99f);
		Book threeMusk = new Book("Action and Adventure", "The Three Musketeers", "Alexandre Dumas", 14.99f);
		Book theCallOfWild = new Book("Action and Adventure", "The Call of the Wild", "Jack London", 5.99f);
		
		Book toKillMockBird = new Book("Classics", "To Kill a Mockingbird", "Harper Lee", 7.19f);
		Book littlWomen = new Book("Classics", "Little Women", "Louisa May Alcott", 14.96f);
		Book beLoved = new Book("Classics", "Beloved", "Toni Morrison", 12.19f);

		System.out.println(lifeOfPi.hashCode());
		System.out.println(threeMusk.hashCode());
		
		
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
