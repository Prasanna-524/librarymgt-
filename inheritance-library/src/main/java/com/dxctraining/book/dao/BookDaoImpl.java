package com.dxctraining.book.dao;
import com.dxctraining.book.dao.BookDao;
import com.dxctraining.book.entities.*;
import com.dxctraining.exceptions.BookNotFoundException;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
@Repository

public class BookDaoImpl implements BookDao{
 
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Book findBookbyId(int id) {
        Book book=entityManager.find(Book.class,id);
        if(book==null)
        {
            throw new BookNotFoundException("Book not found");
        }
        return book;
    }
    public Book add(Book book) {
        entityManager.persist(book);
        return book;
    }
    public Book updateBookcost(Book book) {
        book=entityManager.merge(book);
       return book;
    }
    public void remove(int id) {
        Book book=findBookbyId(id);
        entityManager.remove(book);
    }
    public Book findBookByName(String bookName){
        String jpaql="from book where name=:bookname";
        Query query= entityManager.createQuery(jpaql);
        query.setParameter("bookname",bookName);
        List<Book>list=query.getResultList();
        Book book=null;
        if(!list.isEmpty()){
           book=list.get(0);
        }
        return book;
    }
}