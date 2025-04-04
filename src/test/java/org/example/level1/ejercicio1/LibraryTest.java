package org.example.level1.ejercicio1;

import org.example.level1.ejercicio1.model.Book;
import org.example.level1.ejercicio1.model.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryTest {
    Library library;
    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("The Lord of the Rings", "Tolkien", "Fantasy"));
        library.addBook(new Book("Martian Chronicles", "Ray Bardbury", "Science Fiction"));
        library.addBook(new Book("1984", "Geoge Orwell", "Dystopic"));
    }
    @Test
    public void testLibrary(){
    Assertions.assertNotNull(new Library());
    }
    @Test
    public void testLibrarySize(){
    Assertions.assertEquals(3,library.getBookSet().size());
    }
    @Test
    public void testBookByPositionOrTitle(){
    Assertions.assertEquals("The Lord of the Rings",library.getBookByPosition(0).getTitle());
    }

    @Test
    public void testIncrementLibrarySize(){
        library.addBook(new Book("The Hobbit", "Tolkien", "Fantasy"));
    Assertions.assertEquals(4,library.getBookSet().size());
    }
    @Test
    public void testDecrementLibrarySize(){
        library.removeBook("The Hobbit");
    Assertions.assertEquals(3,library.getBookSet().size());
    }
    @Test
    public void testAlphabeticalOrder(){
        List<Book> listOfBooks = new ArrayList<>(library.getBookSet());
        List<Book> AlphabeticalList = new ArrayList<>(listOfBooks);
        AlphabeticalList.sort(Comparator.comparing(Book::getTitle));

        Assertions.assertEquals("1984",AlphabeticalList.get(0).getTitle());
        Assertions.assertEquals("Martian Chronicles",AlphabeticalList.get(1).getTitle());

        AlphabeticalList.add(new Book("The Hobbit", "Tolkien", "Fantasy"));
        AlphabeticalList.sort(Comparator.comparing(Book::getTitle));
        Assertions.assertEquals("The Hobbit",AlphabeticalList.get(2).getTitle());

    }
}



