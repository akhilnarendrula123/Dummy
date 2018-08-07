package com.cg.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.beans.Book;
import com.cg.spring.service.IBookService;

@RestController
public class BookController {
	@Autowired
	private IBookService service;

	@RequestMapping("/books")
	public List<Book> showAllBooks() {
		return service.showAllBook();
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		service.addBook(book);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void DeleteBook(@PathVariable Integer id) {
		service.deleteBook(id);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public void UpdateBook(@RequestBody Book book, @PathVariable Integer id) {
		service.updateBook(id, book);
	}

}
