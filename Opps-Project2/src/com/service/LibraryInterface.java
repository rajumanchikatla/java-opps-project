package com.service;

import com.model.Book;
import com.model.Student;

public interface LibraryInterface {
	
	public void addBook(Book book);
	
	public void addStudent(Student student);
	
	public void issueBook(Book book, Student student);
	
	public void printManagement();
	
}