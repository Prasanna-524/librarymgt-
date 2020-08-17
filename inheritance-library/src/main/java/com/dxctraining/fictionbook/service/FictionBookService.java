package com.dxctraining.fictionbook.service;
import com.dxctraining.fictionbook.entities.*;

public interface FictionBookService {
		 FictionBook findBookById(int bookid);
		 FictionBook addBook(FictionBook fictionBook) ;
	}
