package com.dxctraining.fictionbook.dao;
import com.dxctraining.fictionbook.entities.*;

public interface FictionBookDao {
		 FictionBook findBookById(int bookid);
		 FictionBook addBook(FictionBook fictionBook);
		
	}

