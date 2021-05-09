package com.i2n.mockito.test_doubles.dummy;

import com.i2n.mockito.test_doubles.fake.Book;

import java.util.Collection;

public interface BookRepository {

    void save(com.i2n.mockito.test_doubles.fake.Book book);
    Collection<Book> findAll();
}
