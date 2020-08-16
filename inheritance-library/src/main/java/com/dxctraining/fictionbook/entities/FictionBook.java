package com.dxctraining.fictionbook.entities;
	import javax.persistence.Entity;

	import com.dxctraining.book.entities.Author;
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
	}

		
