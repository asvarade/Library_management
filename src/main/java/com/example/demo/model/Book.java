package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srNo;
	@Column
	private String BookName;
	@Column
	private String Author;
	@Column
	private String pages;
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	
	public Book(String bookName, String author, String pages) {
		super();
		BookName = bookName;
		Author = author;
		this.pages = pages;
	}
	
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [srNo=" + srNo + ", BookName=" + BookName + ", Author=" + Author + ", pages=" + pages + "]";
	}
	
	
}
