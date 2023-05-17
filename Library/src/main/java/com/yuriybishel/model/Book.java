package com.yuriybishel.model;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String dateIssue;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String dateIssue) {
        this.name = name;
        this.author = author;
        this.dateIssue = dateIssue;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(dateIssue, book.dateIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, dateIssue);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateIssue='" + dateIssue + '\''  +
                '}' + "\n";
    }
}
