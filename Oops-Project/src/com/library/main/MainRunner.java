package com.library.main;

import com.library.model.Book;
import com.library.model.Student;
import com.library.service.LibraryService;
import com.library.service.LibraryInterface;

public class MainRunner {
	
	public static void main(String[] args) {
		//int id, String bookName, String autor, int noOfCopies
		Book book1 = new Book(1, "C Basics", "Jhon Doe", 5);
		Book book2 = new Book(2, "Java Basics", "Mary Smith", 6);
		Book book3 = new Book(3, "Python Basics", "Smith", 2);
		Book book4 = new Book(4, "react Basics", "buttler", 3);
		
		LibraryInterface libraryInterface = new LibraryService();
		libraryInterface.addBook(book1);
		libraryInterface.addBook(book2);
		libraryInterface.addBook(book3);
		libraryInterface.addBook(book4);
		
		Student s1 = new Student(123, 12);
		Student s2 = new Student(124, 13);
		Student s3 = new Student(125, 12);
		Student s4 = new Student(126, 12);
		
		libraryInterface.addStudent(s1);
		libraryInterface.addStudent(s2);
		libraryInterface.addStudent(s3);
		libraryInterface.addStudent(s4);
		
		
		libraryInterface.printManagement();
		//libraryInterface.printManagement();
		libraryInterface.issueBook(book1, s1);
		//libraryInterface.printManagement();
		libraryInterface.issueBook(book2, s4);
		libraryInterface.issueBook(book1, s1);
		//libraryInterface.issueBook(book3, s1);
		libraryInterface.issueBook(book2, s3);
		libraryInterface.issueBook(book1, s4);
		libraryInterface.issueBook(book3, s4);
		libraryInterface.issueBook(book4, s4);
		
		
	}
}
