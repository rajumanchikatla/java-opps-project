package com.library.service;

import com.library.model.Book;
import com.library.model.Student;

public interface LibraryInterface {
	
	public void addBook(Book book);
	
	public void addStudent(Student student);
	
	public void issueBook(Book book, Student student);
	
	public void printManagement();
	
}
