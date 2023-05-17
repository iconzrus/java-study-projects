package com.yuriybishel.model;

import java.util.ArrayList;
import java.util.Objects;

public class BookShelf {
    private int number;
    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf() {
    }

    public BookShelf(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public int searchBook(Book book) {
        return this.books.indexOf(book);
    }

    public ArrayList<Book> allAuthorBooks(String authorName) {
        ArrayList<Book> List = new ArrayList<>();
        for (Book book : this.books) {
            if (authorName.equals(book.getAuthor())) {
                List.add(book);
            }
        }
        return List;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelf bookShelf = (BookShelf) o;
        return number == bookShelf.number && Objects.equals(books, bookShelf.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, books);
    }

    @Override
    public String toString() {
        return "\n" + "BookShelf{" +
                "number=" + number +
                ", books=" + books +"}"
                ;
    }
}
