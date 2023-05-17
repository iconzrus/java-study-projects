package com.yuriybishel.Program;

import com.yuriybishel.model.BookShelf;
import com.yuriybishel.model.Library;
import com.yuriybishel.util.Generator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = Generator.generateBookshelf();
        System.out.println(bookShelf);
        Library library = Generator.generateLibrary();
        System.out.println(library);
    }
}