package application;
import book.Book;
import library.Library;



public class LibraryApp {

	public static void main(String[] args) {
		System.out.println("Adding books...");
		
		Book book1 = new Book("How To Be The Javatar", "Ekin", "642-543672819", 59.99);
		Book book2 = new Book("Java For Dummies", "Smart Fella", "149-917357291", 11.99);
		Book book3 = new Book("How On Earth Will I Ever Learn Git", "Ian", "727-610937848", 14.99);
		Book book4 = new Book("Never Put This In Your Library", "Evil Person", "425-789123482", 129.99);
		Library lib = new Library();
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		lib.displayBooks();
		
		System.out.println();
		
		System.out.println("Searching for book with ISBN: 149-917357291");
		Book search = lib.searchByISBN("149-917357291");
		if(search != null) {
			System.out.println("Book found: " + search.toString());
		} else {
			System.out.println("Book not found.");
		}
		
		System.out.println();
		
		System.out.println("Searching for book with ISBN: 149-917357292");
		search = lib.searchByISBN("149-917357292");
		if(search != null) {
			System.out.println("Book found: " + search.toString());
		} else {
			System.out.println("Book not found.");
		}
		
		
		
		System.out.println();
		
		lib.removeBook(book3);
		
		System.out.println();
		
		lib.displayBooks();
		
		System.out.println();
		
		// This book was never added to the library
		lib.removeBook(book4);
	}
}
