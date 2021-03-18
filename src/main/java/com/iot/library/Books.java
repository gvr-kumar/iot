package com.iot.library;

public class Books {
	
	private String Title;
	private String Author;
	private String procuredDate;
	private String Status;
	
	
	public Books(String Title, String Author, String procuredDate) {
        this.Title = Title;
        this.Author = Author;
        this.procuredDate = procuredDate;
    }
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getProcuredDate() {
		return procuredDate;
	}
	public void setProcuredDate(String procuredDate) {
		this.procuredDate = procuredDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Author == null) ? 0 : Author.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
//		result = prime * result + ((procuredDate == null) ? 0 : procuredDate.hashCode());
		 return result; 
		//return Author.hashCode() ^ Status.hashCode() ^ Title.hashCode() ;		
	}

//	@Override
//	public boolean equals(Books obj) {
//		if (this == obj) return true;
////		  return this.Author.equals(obj.Author) && this.Title.equals(obj.Title);         
//		
//	}
	/*
	 * if (this == obj) return true; if (obj == null) return false; if (getClass()
	 * != obj.getClass()) return false; Books other = (Books) obj; if (Author ==
	 * null) { if (other.Author != null) return false; } else if
	 * (!Author.equals(other.Author)) return false; if (Status == null) { if
	 * (other.Status != null) return false; } else if (!Status.equals(other.Status))
	 * return false; if (Title == null) { if (other.Title != null) return false; }
	 * else if (!Title.equals(other.Title)) return false; if (procuredDate == null)
	 * { if (other.procuredDate != null) return false; } else if
	 * (!procuredDate.equals(other.procuredDate)) return false; return true; }
	 */

//	public void addbook()
//	{
//		
//	}
//	
//	public void findbook()
//	{
//		
//	}
//	
//	public void displayAllBooks()
//	{
//		
//	}
//	
//	
//	
//	public void checkoutBook()
//	{
//	
//	}
//	
//	public void checkinBook()
//	{
//	
//	}

}
