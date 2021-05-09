package com.i2n.mockito.test_doubles.dummy;

import com.i2n.mockito.test_doubles.fake.Book;
import com.i2n.mockito.test_doubles.fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    Map<String, com.i2n.mockito.test_doubles.fake.Book> bookStore = new HashMap<>();

    @Override
    public void save(com.i2n.mockito.test_doubles.fake.Book book) {
        bookStore.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}

