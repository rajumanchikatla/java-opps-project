package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	public List<Book> bookList;
	
	public Library() {
		bookList = new ArrayList<Book>();
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Library [bookList=" + bookList + "]";
	}
}
