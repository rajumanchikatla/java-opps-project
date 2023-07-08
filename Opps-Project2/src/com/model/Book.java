package com.model;

public class Book {
	
	private int id;
	
	private String bookName;
	
	private String autor;
	
	private int noOfCopies;

	public Book(int id, String bookName, String autor, int noOfCopies) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.autor = autor;
		this.noOfCopies = noOfCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", autor=" + autor + ", noOfCopies=" + noOfCopies + "]";
	}

}
