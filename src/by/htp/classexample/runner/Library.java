package by.htp.classexample.runner;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books = new ArrayList();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getBooks() {
		return books;
	}

}
