package de.mcalm.spring.springbootin10steps.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.mcalm.spring.springbootin10steps.domain.Book;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(new Book("Ranga", "Spring"), new Book("Puschkin", "Pique Dame"));
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestParam("author") String author, @RequestParam("title") String title) {
		//insert book
		return new Book(author, title);
	}
}
