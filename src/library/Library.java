package library;

import book.Book;

public class Library {

	private Book[] books = new Book[5];
	private int count= 0;
	
	public boolean addBook(Book book) {
		if(count == 5) 
		{
			System.out.println("Library full! Cannot add more books!");
			return false;
		}
		books[count]= book;
		count++;
		System.out.println("Book added successfully!");
		return true; 
	}
	
	public boolean removeBook(Book book) {
		for(int i=0; i<5; i++) {
			if(book.equals(books[i]))
			{
				books[i]= null;
				System.out.println("Book successfully removed!");
				count--;
				return true; 
			}
		}
		System.out.println("Book does not exist!");
		return false; 
	}
}
