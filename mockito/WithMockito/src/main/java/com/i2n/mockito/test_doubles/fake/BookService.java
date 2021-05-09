package com.i2n.mockito.test_doubles.fake;

import com.i2n.mockito.test_doubles.dummy.EmailService;

public class BookService {

    private EmailService emailService;
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository, EmailService emailService) {
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public int findNumberOfBooks() {
        return bookRepository.findAll().size();
    }
}
