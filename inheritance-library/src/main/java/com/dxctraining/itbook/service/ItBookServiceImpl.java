package com.dxctraining.itbook.service;
import com.dxctraining.book.entities.Book;
import com.dxctraining.itbook.dao.ItBookDao;
import com.dxctraining.itbook.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ItBookServiceImpl implements ItBookService{
	 @Autowired
	   private ItBookDao dao;
	    
	 @Override
	    public ItBook findBookById(int id) {
	    	ItBook itbook = dao.findBookById(id);
	        return itbook;
	    }
	    public ItBook addBook(ItBook itbook) {
	        itbook = dao.addBook(itbook);
	        return itbook;
	    }
	    
	}	

