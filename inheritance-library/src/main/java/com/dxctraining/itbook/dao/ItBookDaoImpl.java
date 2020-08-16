package com.dxctraining.itbook.dao;
import org.springframework.stereotype.Repository;
import com.dxctraining.itbook.entities.*;
import com.dxctraining.book.entities.Book;
import com.dxctraining.itbook.dao.ItBookDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

	@Repository
	public class ItBookDaoImpl implements ItBookDao{

	    @PersistenceContext
	    private EntityManager entityManager;
	    
	    @Override
		public ItBook findBookById(int id) {
			ItBook itbook = entityManager.find(ItBook.class, id);
			return itbook;
		}
	   
	    @Override
	    public ItBook addBook(ItBook itbook) {
	        itbook=entityManager.merge(itbook);
	        return itbook;
	    }
		
	}

	


