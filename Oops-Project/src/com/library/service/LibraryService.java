package com.library.service;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.Library;
import com.library.model.Student;

public class LibraryService implements LibraryInterface {
	
	Library library;
	
	List<Student> students;
 	
	public LibraryService(){
		library = new Library();
		students = new ArrayList<Student>();
	}
	

	public void addBook(Book book) {
		library.getBookList().add(book);
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}


	public void issueBook(Book book, Student student) {
		for(Student s: students) {
			if(s == student) {
				if (s.getBooks().contains(book)) {
	                System.out.println("this Student already has the book: " + s.getRollNumber() + " " + book.getBookName());
	                return;
	            }
				if(s.getBooks().size() >= 3) {
					System.out.println("No of Book Exceeded for Student: "+s.getRollNumber()+" "+book.getBookName());
					return;
				}
				else {
					for(Book b: library.getBookList()) {
						if(b == book) {
							if(b.getNoOfCopies() > 0) {
								s.getBooks().add(book);
								b.setNoOfCopies(b.getNoOfCopies()-1);
								System.out.println(book.getBookName()+"book issued successfully to " +s.getRollNumber());
								return;
							}
								else {
								System.out.println("Copies not available for book: "+s.getRollNumber()+" "+book.getBookName());
								return;
							}
							}
						}
					}
					System.out.println("Book Not Found: "+s.getRollNumber()+" "+book.getBookName());
					return;
				}
			}
		
		     System.out.println("Student Not Found: "+student.getRollNumber()+" "+book.getBookName());
		return;	
	}

	public void printManagement() {
		
		System.out.println(library);
		System.out.println(students);
	}

}
