package com.dxctraining.book.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.dxctraining.book.entities.Book;
@Entity
public class Author {
	@Id
	private int id;
	private String name;
	
	public Author(int id, String name){	
	this.id=id;
	this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setId(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if ((obj == null) || !(obj instanceof Author)) {
			return false;
		}

		Author that = (Author) obj;
		boolean isequal = this.id==that.id;
		return isequal;
	}	
}	


