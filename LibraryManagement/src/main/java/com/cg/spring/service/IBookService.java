package com.cg.spring.service;

import java.util.List;

import com.cg.spring.beans.Book;

public interface IBookService {

	public void addBook(Book book);

	public void deleteBook(Integer id);

	public void updateBook(Integer id, Book book);

	public List<Book> showAllBook();
}
