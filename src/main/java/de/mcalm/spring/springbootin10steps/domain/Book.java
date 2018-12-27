package de.mcalm.spring.springbootin10steps.domain;

public class Book {

	private long id;
	private String title;
	private String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
