package com.boottech.springreactivemongodb.repository;

import com.boottech.springreactivemongodb.domain.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
