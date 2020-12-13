package com.iot.hashing;

public class Book implements Comparable<Book>{
	
	private String bookGenre;
	private String bookTitle;
	private String bookAuthor;
	private float bookPrice;
	private Genre genreObj = null;
	
	public Genre getGenreObj() {
		return genreObj;
	}

	public void setGenreObj(Genre genreObj) {
		this.genreObj = genreObj;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}	

	public Book(String bookGenre, String bookTitle, String bookAuthor, float bookPrice) {
		super();
		this.bookGenre = bookGenre;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public int compareTo(Book b) {
		return this.bookTitle.compareTo(b.bookTitle);
	}
}
