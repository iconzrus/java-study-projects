package com.yuriybishel.util;

import com.yuriybishel.model.Book;
import com.yuriybishel.model.BookShelf;
import com.yuriybishel.model.Library;

public class Generator {

    public static int generateNumber(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    /**
     * Генерация случайной книги со случайными названием, автором, годом, взятых из заранее подготовленных списков
     *
     * @return
     */

    public static Book generateBook() {
        String[] names = {"Boris Godunov", "War and peace", "Lolita", "Crime and Punishment", "Book of jungle", "Hero"};
        String[] authors = {"Pushkin", "Tolstoy", "Nabokov", "Dostoevsky", "Kipling", "Lermontov"};
        String[] datesIssue = {"1825", "1894", "1932", "1902", "1952", "1923"};
        int i = generateNumber(0, names.length - 1);
        return new Book(names[i], authors[i], datesIssue[i]);
    }

    /**
     * Генерация случайной книжной полки со случайным количеством книг на ней
     */
    public static BookShelf generateBookshelf() {
        BookShelf bookShelf = new BookShelf(generateNumber(1, 20));
        int n = generateNumber(1, 10);
        for (int i = 0; i < n; i++) {
            Book book = generateBook();
            bookShelf.addBook(book);
        }
        return bookShelf;
    }

    /**
     * Генерация библиотеки со случайным количеством книжных полок
     */
    public static Library generateLibrary() {
        Library library = new Library("N" + generateNumber(1, 20), "A" + generateNumber(1, 20));
        int i = generateNumber(1, 10);
        for (int j = 0; j < i; j++) {
            BookShelf bookshelf = generateBookshelf();
            library.addBookShelf(bookshelf);
        }
        return library;
    }
}