package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ServiceBooksIMPL;

@RestController
@RequestMapping("/Library")
public class LibraryController {
	
	@Autowired
	ServiceBooksIMPL servicebooksimpl;

	@GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
    	List<Book> list = servicebooksimpl.getAllBooks();
    	return list;
    }
	@GetMapping("/getBook/{id}")
	public Book GetBookById(@PathVariable("id")  int id) {
		Book book = servicebooksimpl.GetBookById(id);
		return book;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		Book saveBook = servicebooksimpl.saveBook(book);
		return saveBook;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		servicebooksimpl.deleteBook(id);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/book")
	public void updateBook(@RequestBody Book book) {
		servicebooksimpl.saveBook(book);
		
	}
	
}
