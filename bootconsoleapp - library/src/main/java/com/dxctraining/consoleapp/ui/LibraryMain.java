package com.dxctraining.consoleapp.ui;

import com.dxctraining.consoleapp.entities.*;
import com.dxctraining.consoleapp.exceptions.*;
import com.dxctraining.consoleapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

import javax.annotation.PostConstruct;
@Component
public class LibraryMain {
	 @Autowired
    private LibraryService service;
	  @PostConstruct
    private void run() {
        Author author1 = new Author(101, "chinni");
        Author author2 = new Author(201, "ammu");
        Author author3 = new Author(301, "chinna");
        Book book1 = new Book(1,"java",250 ,author1);
        Book book2 = new Book(2,"c",350 ,author2);
        Book book3 = new Book(3,"python",200 ,author3);
        book1 = service.save(book1);
        book2 = service.save(book2);
        book3 = service.save(book3);
        int id1 = book1.getId();
        Book fetched1 = service.findBookbyId(id1);
        System.out.println("book id =" + fetched1.getId() + " book name" + fetched1.getName() + "book cost " + fetched1.getCost());
        Book fetched2 = service.findBookbyId(id1);
        System.out.println("book id =" + fetched2.getId() + " book name" + fetched2.getName() + "book cost " + fetched2.getCost());
        Book fetched3 = service.findBookbyId(id1);
        System.out.println("book id =" + fetched3.getId() + " book name" + fetched3.getName() + "book cost " + fetched3.getCost());
  } 
	  catch (BookNotFoundException e) {
          e.printStackTrace();
      } 
}