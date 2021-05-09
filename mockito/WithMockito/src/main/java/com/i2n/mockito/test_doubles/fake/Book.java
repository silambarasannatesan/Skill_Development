package com.i2n.mockito.test_doubles.fake;

import java.time.LocalDate;

public class Book {
    private String bookId;
    private String title;
    private double price;
    private LocalDate localDate;


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public Book(String bookId, String title, double price, LocalDate localDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.localDate = localDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Book(String bookId) {
        this.bookId = bookId;
    }

}
