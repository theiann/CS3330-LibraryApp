package library;

import book.Book;

public class Library {

	private Book[] books = new Book[5];
	private int count= 0;
	
	/**
	 * 
	 * This method will add a book to the created "books" array 
	 * 
	 * @param book
	 * 				This argument will hold the book that is to be added to the library
	 * @return
	 * 				Return false if there is no more space to be added in the array.
	 * 				Returns true if the book is successfully added
	 */
	
	public boolean addBook(Book book) {
		if(count == 5) 
		{
			return false;
		}
		books[count]= new Book(book);
		count++;
		return true; 
	}
	
	/**
	 * This method will remove the passed book from the library and shift the remaining books so there are no empty spaces 
	 * @param book
	 * 			book to be removed from the library
	 * @return
	 * 			Returns true if the book gets removed, and returns false if the book does'nt exist 
	 */  		

public boolean removeBook(Book book) {
	for(int i=0; i<count; i++) { 
		if(book.equals(books[i]))
		{ 
			for(int j=i; j<count-1; j++) {
				books[j]= books[j+1];
			}
			books[count-1]= null;   
			count--;    
			return true;    
			}   
		}  

return false;   
	} 

/**
 * This method searches the library for a book with the same ISBN that was passed
 * 
 * @param ISBN 
 * 				the value to compare
 * @return
 * 			returns the book with same ISBN if found, otherwise returns NULL
 */
public Book searchByISBN(String ISBN) {
	if(ISBN == null) {
		return null; 
	}
	for (int i=0; i<5; i++) {
		if (ISBN.equals(books[i].getISBN())) {
			return books[i];
		}
	}
	return null;
}

/**
 * this method simply calls the to string function in the Book class for each book in the library and then prints info about them
 */
public void displayBooks() {
	if (count==0) {
		System.out.println("The library is Empty.");
	}
	
	for (int i=0;i<count;i++) {
		System.out.printf("%d. %s%n", 1+i, books[i].toString());  
	}
}


}

