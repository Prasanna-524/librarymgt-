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
}
	