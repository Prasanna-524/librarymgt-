package com.dxctraining.consoleapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	 @Id
	  @GeneratedValue
	    private int id;
	    private String name;
	    private double cost;
	    private Author author;
	    public Book(String name, double cost,Author author) {
	        this.name = name;
	        this.cost = cost;
	        this.author=author;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getCost() {
	        return cost;
	    }
	    public void setCost(double cost) {
	        this.cost = cost;
	    }
	    
	    public Author getAuthor() {
	        return author;
	    }
	    public void setAuthor(Author author) {
	        this.author = author;
	    }
}

