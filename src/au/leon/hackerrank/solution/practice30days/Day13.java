package au.leon.hackerrank.solution.practice30days;

import java.util.*;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class MyBook extends Book {
	int price;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see au.leon.hackerrank.solution.practice30days.Book#display()
	 */
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.title + "\n" + "Author: " + this.author + "\n" + "Price: " + this.price);

	}

}

public class Day13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}
}