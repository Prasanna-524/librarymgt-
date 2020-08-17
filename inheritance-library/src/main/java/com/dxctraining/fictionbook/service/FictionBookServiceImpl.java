package com.dxctraining.fictionbook.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctraining.fictionbook.dao.FictionBookDao;
import com.dxctraining.fictionbook.entities.FictionBook;
import com.dxctraining.itbook.dao.ItBookDao;
import com.dxctraining.itbook.entities.ItBook;
import com.dxctraining.itbook.service.ItBookService;

	public class  FictionBookServiceImpl implements FictionBookService{
		 @Autowired
		 private FictionBookDao dao;
		    
		 @Override
		    public FictionBook findBookById(int id) {
			 FictionBook  fictionBook= dao.findBookById(id);
		        return fictionBook;
		    }
		    public FictionBook addBook( FictionBook  fictionBook) {
		    	 fictionBook = dao.addBook( fictionBook);
		        return  fictionBook;
		    }
		    
		}	

