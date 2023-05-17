package com.yuriybishel.model;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private String name;
    private String address;
    private final ArrayList<BookShelf> bookshelves = new ArrayList<>();

    public Library() {
    }

    public Library(String name) {
        this.name = name;
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBookShelf(BookShelf bookshelf) {
        this.bookshelves.add(bookshelf);
    }

    public void removeBookShelf(BookShelf bookshelf) {
        this.bookshelves.remove(bookshelf);
    }

    public BookShelf searchBookshelf(int n) {
        for (BookShelf bookshelf : this.bookshelves) {
            if (n == bookshelf.getNumber()) {
                return bookshelf;
            }
        }
        return null;
    }

    public int searchBookshelf(BookShelf bookshelf) {
        return this.bookshelves.indexOf(bookshelf);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(address, library.address) && Objects.equals(bookshelves, library.bookshelves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, bookshelves);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bookshelves=" + bookshelves +
                '}';
    }
}
