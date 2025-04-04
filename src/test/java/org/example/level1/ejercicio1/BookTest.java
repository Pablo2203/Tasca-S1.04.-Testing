package org.example.level1.ejercicio1;

import org.example.level1.ejercicio1.model.Book;
import org.example.level1.ejercicio1.model.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book1 = new Book("The Lord of the Rings", "Tolkien", "Fantasy");
        book2 = new Book("Martian Chronicles", "Ray Bardbury", "Science Fiction");
        book3 = new Book("The Lord of the Rings", "Tolkien", "Fantasy");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void testDuplicateBooks() {
        Assertions.assertTrue(book1.equals(book3), "Books with the same title are equal");
        Assertions.assertFalse(book1.equals(book2), "Books with different titles are not equal");
        Assertions.assertFalse(book1.equals(null), "Null is not equal to any object");
        Assertions.assertNotEquals(book1.hashCode(), book2.hashCode(),
                "Hash codes for two different books should be different");
        Assertions.assertEquals(book1.hashCode(), book3.hashCode(),
                "Hash codes for two equal books should be the same");
    }
}