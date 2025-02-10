package library;

import book.Book;

public class Library {

	private Book[] books = new Book[5];
	private int count= 0;
	
	/**
	 * 
	 * This method will add a book to the created "books" array 
	 * 
	 * @param count 
	 * 				This argument will hold the number of books that are in the array 
	 * @return
	 * 				Return false if there is no more space to be added in the array.
	 * 				Returns true if the book is successfully added
	 */
	
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
}

