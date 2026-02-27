package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{ // jparepository provides all the methods to push the data into database. 
																	  // we just need to create a reference variable of this interface and use this inbuilt methods

}
