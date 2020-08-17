package com.dxctraining.ui;
import com.dxctraining.fictionbook.entities.*;
import com.dxctraining.itbook.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.book.entities.Book;
import com.dxctraining.book.entities.Author;
import com.dxctraining.book.service.*;
import com.dxctraining.fictionbook.service.FictionBookService;
import com.dxctraining.itbook.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import javax.annotation.PostConstruct;

@Component
public class BookUi {
	@Autowired
	private ItBookService itbookService;
	@Autowired
	private FictionBookService fictionbookService;
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		BookUi demo = new BookUi();
		demo.runApp();
	}

	@PostConstruct
	public void runApp() {

		try {
			Author author1 = new Author(1,"chinni");
			Author author2 = new Author(2,"sri");
			FictionBook fictionbook = new FictionBook(11,"farm",3,author1,"animal farm");
            fictionbook=FictionBookService.addBook(fictionbook);
            String fictionbook1=fictionbook.getName();
            FictionBook fictionbook=FictionBookService.findBookByid(fictionbook1);
            System.out.println("fiction book name =" +fictionbook.getName() + " fiction book edition" + fictionbook.getEdition()+ " author is" + fictionbook.getAuthor())
            
            ItBook itbook = new ItBook(12,"morris",3,author1,"beloved");
            itbook=ItBookService.addBook(itbook);
	            String itbook1 = itbook.getName();
	            ItBook itbook = ItBookService.findBookById(itbook1);
	            System.out.println("it book name =" + itbook.getName() + " it book edition" + itbook.getEdition()+ "author is " + itbook.getAuthor());


	        } catch (BookNotFoundException e) {
	            e.printStackTrace();
	        } catch (InvalidArgumentException e) {
	            e.printStackTrace();
	        }
		}
	}
	        


