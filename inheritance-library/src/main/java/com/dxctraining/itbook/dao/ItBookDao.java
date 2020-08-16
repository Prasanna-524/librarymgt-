package com.dxctraining.itbook.dao;
import com.dxctraining.itbook.entities.*;

public interface ItBookDao {
		 ItBook findBookById(int id);
		 ItBook addBook(ItBook itbook);
		
	}


