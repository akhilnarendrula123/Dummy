package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Book;

@Repository
public interface IBookRepo extends CrudRepository<Book, Integer>{

}
