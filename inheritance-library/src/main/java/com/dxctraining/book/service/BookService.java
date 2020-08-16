package com.dxctraining.book.service;

import com.dxctraining.book.entities.Book;
public interface BookService {
	Book findBookbyId(String id);
	Book findBookByName(String bookName);
	Book add(Book book);
	Book updateBookcost(Book book);
	void remove(String id);
}
