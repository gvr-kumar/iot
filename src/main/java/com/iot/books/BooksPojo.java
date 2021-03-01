package com.iot.books;

import java.util.Date;

import com.iot.enums.BookStatus;

public class BooksPojo {
	
	/*1)Maintain the repository of Books

	2) Provide an utility to validate the existing books and add them to the repository

	3) if the book is available, then add it always to the repository

	4) checkin (when we give back) - check out (when we take) of books should be the possibility: count will be updated 
	when checked in, checked out

	5) At any point of time, utility should give us the snapshot of the repository.

	6) abandon the entity should be a possibility: should remove the book from the repo; count should be updated

	7)bookid, book - name, author, price, dept, procured date, status: except status all others will not change

	8) status : available / Checked out / Abandoned (enum)

	9)methods to get count of 1) individual book, dept wise, grandtotal

	snapshot : 

	 the total books available : 4213423423

	 The # of books checked out : 234234

	 the number of books at DEPT1 : 234234 (Optional)

	  the number of books at DEP2 : 234234 (Optional)*/
	
	/*
	 * 
	 * 
	 */
	
	//private final String bookId;
	
	private final String bookName;
	
	private final String bookAuthor;
	
	private final Float bookPrice;
	
	private final String bookDept;
	
	private final String bookProcDate;
	
	private BookStatus bookStatus;
	
	public BooksPojo(String bookName, String bookAuthor, String bookDept, BookStatus bookStatus, String bookProcDate, Float bookPrice)
	{
		//this.bookId = bookId;
		
		this.bookName = bookName;
		
		this.bookAuthor = bookAuthor;
		
		this.bookDept = bookDept;
		
		this.bookStatus = bookStatus;
		
		this.bookProcDate = bookProcDate;
		
		this.bookPrice = bookPrice;
	}
	
	
	
	/*
	 * public String getBookId() { return bookId; }
	 */
	
	public String getBookName()
	{
		return bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}

	public Float getBookPrice() {
		return bookPrice;
	}

	public String getBookDept() {
		return bookDept;
	}

	public String getBookProcDate() {
		return bookProcDate;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}



	
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((bookAuthor == null) ? 0 : bookAuthor.hashCode());
	 * result = prime * result + ((bookDept == null) ? 0 : bookDept.hashCode());
	 * result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	 * result = prime * result + ((bookPrice == null) ? 0 : bookPrice.hashCode());
	 * result = prime * result + ((bookProcDate == null) ? 0 :
	 * bookProcDate.hashCode()); result = prime * result + ((bookStatus == null) ? 0
	 * : bookStatus.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) { return true;
	 * } if (obj == null) { return false; } if (getClass() != obj.getClass()) {
	 * return false; } BooksPojo other = (BooksPojo) obj; if (bookAuthor == null) {
	 * if (other.bookAuthor != null) { return false; } } else if
	 * (!bookAuthor.equals(other.bookAuthor)) { return false; } if (bookDept ==
	 * null) { if (other.bookDept != null) { return false; } } else if
	 * (!bookDept.equals(other.bookDept)) { return false; } if (bookName == null) {
	 * if (other.bookName != null) { return false; } } else if
	 * (!bookName.equals(other.bookName)) { return false; } if (bookPrice == null) {
	 * if (other.bookPrice != null) { return false; } } else if
	 * (!bookPrice.equals(other.bookPrice)) { return false; } if (bookProcDate ==
	 * null) { if (other.bookProcDate != null) { return false; } } else if
	 * (!bookProcDate.equals(other.bookProcDate)) { return false; } if (bookStatus
	 * != other.bookStatus) { return false; } return true; }
	 */
	 
	
	
	@Override
	public String toString() {
		return this.bookName + "-" + this.bookAuthor+ "-" + this.bookProcDate+ "-" + this.bookStatus + "-" + this.bookPrice;
	}
}
