package com.dxctraining.book.service;

import com.dxctraining.book.entities.Book;
public interface BookService {
	Book findBookbyId(int id);
	Book findBookByName(String bookName);
	Book add(Book book);
	Book updateBookcost(Book book);
	void remove(int id);
}
