package com.dxctraining.consoleapp.service;
import com.dxctraining.consoleapp.entities.*;
import java.util.*;
public interface LibraryService {
	Book findBookbyId(int id);
	Book findBookByName(String bookName);
	Book save(Book book);
	Book updateBookcost(Book book);
	void remove(int id);
	
}



	