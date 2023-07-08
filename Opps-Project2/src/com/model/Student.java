package com.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int rollNumber;
	
	private int grade;

	private List<Book> books;
	
	
	public Student(int rollNumber, int grade) {
		this.rollNumber = rollNumber;
		this.grade = grade;
		this.books  = new ArrayList<Book>();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", grade=" + grade + ", books=" + books + "]";
	}
	

}
