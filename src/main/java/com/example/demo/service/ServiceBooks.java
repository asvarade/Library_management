package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface ServiceBooks {

	public List<Book> getAllBooks();
	
	public Book GetBookById(int id);
	
	public Book saveBook(Book book);
	
	public void deleteBook(int id);
	
	public void updateBook(Book book);
}
