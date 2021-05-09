package com.i2n.mockito.test_doubles.stub;

import com.i2n.mockito.test_doubles.stub.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    public List<Book> getNewBooksWithAppliedDiscount(int discRate, int days) {
//        List<Book> newBooks = bookRepository.findNewBooks(days);
//        for (Book book : newBooks) {
//            double price = book.getPrice();
//            double newPrice = price - (discRate * price / 100);
//            book.setPrice(newPrice);
//        }
//        return newBooks;
//    }

}
