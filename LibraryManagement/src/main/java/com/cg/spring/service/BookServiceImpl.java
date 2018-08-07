package com.cg.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.spring.beans.Book;
import com.cg.spring.repo.IBookRepo;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepo repo;

	@Override
	public void addBook(Book book) {
		repo.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateBook(Integer id, Book book) {
		book.setId(id);
		repo.save(book);
	}

	@Override
	public List<Book> showAllBook() {
		List<Book> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

}
