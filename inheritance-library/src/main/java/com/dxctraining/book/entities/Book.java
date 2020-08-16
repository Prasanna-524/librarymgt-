package com.dxctraining.book.entities;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Book {

    @Id
    @GeneratedValue
    private int bookid;

    private String name;

    private int edition;
    private Author author;

    public Book(int bookid, String name, int edition,Author author) {
		
		this.bookid = bookid;
		this.name = name;
		this.edition = edition;
		 this.author=author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
	public int hashCode()
	{
		return bookid;
	}
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Book) ) {
			return false;
	   }
		
	    Book that=(Book)arg;	
		boolean isequal=this.bookid==that.bookid;
		return isequal;
	}
    }
