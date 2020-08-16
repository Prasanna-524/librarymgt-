package com.dxctraining.book.dao;

import com.dxctraining.book.entities.Book;

public interface BookDao {

		Book findBookbyId(String id);
		Book findBookByName(String bookName);
		Book add(Book book);
		Book updateBookcost(Book book);
		void remove(String id);
	

}
