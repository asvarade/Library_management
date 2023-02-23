package com.example.demo.service;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookRepo;
import com.example.demo.model.Book;

@Service
public class ServiceBooksIMPL implements ServiceBooks{

	@Autowired
	BookRepo repo;
	
	@Override
	public List<Book> getAllBooks() {
		List<Book> list = new ArrayList(); 
		repo.findAll().forEach(a -> list.add(a));
		return list;
	}

	@Override
	public Book GetBookById(int id) {
		Book book = repo.findById(id).get();
		return book;
	}

	@Override
	public Book saveBook(Book book) {
		Book saveBook = repo.save(book);
		return saveBook;
	}

	@Override
	public void deleteBook(int id) {
		repo.deleteById(id);
	}

	@Override
	public void updateBook(Book book) {
		repo.save(book);
	}

}
