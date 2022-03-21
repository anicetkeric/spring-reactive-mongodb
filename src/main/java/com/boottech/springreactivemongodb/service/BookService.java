package com.boottech.springreactivemongodb.service;

import com.boottech.springreactivemongodb.domain.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Flux<Book> getAllBook();

    Mono<Book> addBook(Book book);

    Mono<Book> getBookById(String id);

    Mono<Book> updateBook(Book book, String id);

    Mono<Void> deleteBookById(String id);
}
