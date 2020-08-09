package service;
import dao.LibraryDao;
import dao.LibraryDaoImpl;
import entities.Book;
import exceptions.BookNotFoundException;
import exceptions.InvalidArgumentException;
import exceptions.InvalidBookCostException;

import java.util.*;
public class LibraryServiceImpl implements LibraryService{
	
		private LibraryDao dao=new LibraryDaoImpl();
		public List<Book> displayAll() {
		       List<Book>list=dao.displayAll();
		       return list;
		    }
		 public Book findBookbyId(String id) {
		       checkbookId(id);
		        Book books=dao.findBookbyId(id);
		        return books;
		    }
		 private void checkbookId(String id) {
		        if(id==null || id.isEmpty())
		        {
		            throw new InvalidArgumentException("null or empty id");
		        }
		    }
		 public Book updateBookcost(String id, double cost) {
		        checkbookId(id);
		        checkbookCost(cost);
		        Book books=dao.updateBookcost(id,cost);
		        return books;
		    }

		    private void checkbookCost(double cost) {
		        if(cost==0|| cost<0)
		        {
		            throw new InvalidBookCostException("invalid cost");
		        }
		    }
		    public void removeBook(String id) {
		        checkbookId(id);
		        dao.removeBook(id);

		    }

		    @Override
		    public void addBook(Book book) {
		        dao.addBook(book);
		    }
		    
		}
