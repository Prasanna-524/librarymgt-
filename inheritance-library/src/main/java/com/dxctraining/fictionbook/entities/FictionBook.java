package com.dxctraining.fictionbook.entities;
	import javax.persistence.Entity;

import com.dxctraining.book.entities.*;
	@Entity
	public class FictionBook extends Book {

		private String fbookname;

	public FictionBook(int bookid, String name, int edition, Author author,String fbookname) {
			super(bookid, name, edition, author);
			this.fbookname = fbookname;
		}

	public String getFbookname() {
		return fbookname;
	}

	public void setFbookname(String fbookname) {
		this.fbookname = fbookname;
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

		
