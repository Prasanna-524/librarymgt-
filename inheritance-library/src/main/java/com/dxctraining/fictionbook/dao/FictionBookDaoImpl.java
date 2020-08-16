package com.dxctraining.fictionbook.dao;
import org.springframework.stereotype.Repository;
	import com.dxctraining.itbook.entities.*;
	import com.dxctraining.book.entities.Book;
	import com.dxctraining.fictionbook.dao.FictionBookDao;
import com.dxctraining.fictionbook.entities.FictionBook;

import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;

		@Repository
		public class FictionBookDaoImpl implements FictionBookDao{

		    @PersistenceContext
		    private EntityManager entityManager;
		    
		    @Override
			public  FictionBook findBookById(int bookid) {
		    	FictionBook fictionBook= entityManager.find(FictionBook.class, bookid);
				return fictionBook;
			}
		   
		    @Override
		    public  FictionBook addBook( FictionBook fictionBook) {
		    	 fictionBook=entityManager.merge( fictionBook);
		        return  fictionBook;
		    }
		}
			
