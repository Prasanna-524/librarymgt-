package com.dxctraining.itbook.entities;

import com.dxctraining.book.entities.Author;
import com.dxctraining.book.entities.Book;

public class ItBook extends Book {
	
	String bookname;

	public ItBook(int bookid, String name, int edition, Author author, String bookname) {
		super(bookid, name, edition, author);
		this.bookname = bookname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
public int hashCode()
{
	return getBookid();
}
public boolean equals(Object arg) {
	if(this==arg) {
		return true;
	}
	
   if(arg==null || !(arg instanceof Book) ) {
		return false;
   }
	
    Book that=(Book)arg;	
	boolean isequal=this.getBookid()==that.getBookid();
	return isequal;
}
}