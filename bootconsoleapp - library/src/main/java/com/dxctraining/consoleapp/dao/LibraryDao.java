package com.dxctraining.consoleapp.dao;

import com.dxctraining.consoleapp.entities.*;
import java.util.*;
public interface LibraryDao {
	Book findBookbyId(int id);
	Book findBookByName(String bookName);
	Book save(Book book);
	Book updateBookcost(Book book);
	void remove(int id);
	

}
