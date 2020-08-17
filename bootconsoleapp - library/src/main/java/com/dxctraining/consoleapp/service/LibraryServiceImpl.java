package com.dxctraining.consoleapp.service;
import com.dxctraining.consoleapp.dao.*;
import com.dxctraining.consoleapp.entities.*;
import com.dxctraining.consoleapp.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
@Transactional
@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryDao dao;

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
    public Book save(Book book) {
        validate(book);
        book=dao.save(book);
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
