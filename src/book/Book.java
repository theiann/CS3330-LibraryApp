package book;

import java.util.Objects;

public class Book {
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0;
	}
	
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
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
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
