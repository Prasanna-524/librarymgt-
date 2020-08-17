package com.dxctraining.book.service;
import com.dxctraining.book.dao.*;
import com.dxctraining.book.entities.*;
import com.dxctraining.exceptions.InvalidArgumentException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
@Transactional
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookDao dao;

    @Override
    public Book findBookbyId(int id) {
        Book book= dao.findBookbyId(id);
        return book;
    }
    @Override
    public Book updateBookcost(Book book) {
        validate(book);
        book=dao.updateBookcost(book);
        return book;
    }
    @Override
    public void remove(int id) {
       dao.remove(id);
    }
    public Book add(Book book) {
        validate(book);
        book=dao.add(book);
        return book;
    }

    public void validate(Object arg){
        if(arg==null){
            throw new InvalidArgumentException("argument is null");
        }
    }

    @Override
    public Book findBookByName(String bookName) {
      Book book =dao.findBookByName(bookName);
       return book;
    }
}
