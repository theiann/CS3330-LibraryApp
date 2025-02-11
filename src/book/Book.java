package book;

import java.util.Objects;

public class Book {
	
	
	/**
	 * This method will construct a new Book object and fill in all members with the parameters provided.
	 * @param title
	 * 				Title of the book being created.
	 * @param author
	 * 				Author of the book being created.
	 * @param ISBN
	 * 				ISBN of the book being created.
	 * @param price
	 * 				Price of the book being created.
	 * 
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This method will construct a new Book with "Unknown" or blank members.
	 */
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0;
	}
	
	
	/**
	 * This method will construct a new Book that's a copy of a provided Book.
	 * @param original
	 * 				The Book being copied.
	 */
	public Book(Book original) {
		this.title = original.title;
		this.author = original.author;
		ISBN = original.ISBN;
		this.price = original.price;
	}

	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	
	
	/**
	 * This method will get the title of a Book.
	 * @return
	 * 			Returns the title of the Book.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * This method will set the title of a Book.
	 * @param title
	 * 			The new title of the Book.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * This method will get the author of a Book.
	 * @return
	 * 			Returns the author of the Book.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * This method will set the author of a Book.
	 * @param author
	 * 			The new author of the Book.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * This method will get the ISBN of a Book.
	 * @return
	 * 		Returns the ISBN of the Book.
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * This method will set the ISBN of a Book.
	 * @param ISBN
	 * 			The new ISBN of the Book.
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	/**
	 * This method will get the price of a Book.
	 * @return
	 * 			Returns the price of the Book.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * This method will set the price of a Book.
	 * @param price
	 * 			The new price of the Book.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/**
	 * This method will return all data in a Book to a single String.
	 */
	@Override
	public String toString() {
		String formattedPrice = String.format("%.2f", price);
		return  title + " by " + author + " (ISBN: " + ISBN + " , $" + formattedPrice + ")";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}
	
	@Override
	/**
	 * This method tests if a Book equals the other by comparing their ISBN.
	 * @return
	 * 			returns true if the IBSN is the same, returns false if the IBSN isn't the same.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN);
	}
	
	
	
	
	
	
	
}
