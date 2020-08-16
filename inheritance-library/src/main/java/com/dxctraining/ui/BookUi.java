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
			Book book1 = new Book(101,"c", 3, author1);
			Book book2 = new Book(102,"java", 8, author1);
			Book book3 = new Book(103,"oops", 2, author2);
			Book book4 = new Book(104,"dbms", 4, author2);
			FictionBook fictionbook = new FictionBook(11,"farm",3,author1,"animal farm");
            fictionbook=FictionBookService.addBook(fictionbook);

            ItBook itbook = new ItBook(12,"morris",3,author1,"beloved");
            itbook=ItBookService.addBook(itbook);
	            String itbook1 = itbook.getName();
	            FictionBook itbook = FictionBookService.findBookById(itbook1);
	            System.out.println("it book name =" + itbook.getName() + " it book edition" + itbook.getEdition()+ " " + fbook.getAuthor());


	        } catch (BookNotFoundException e) {
	            e.printStackTrace();
	        } catch (InvalidArgumentException e) {
	            e.printStackTrace();
	        }
		}
	}
	        


