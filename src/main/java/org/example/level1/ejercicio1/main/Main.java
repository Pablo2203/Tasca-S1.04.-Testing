package org.example.level1.ejercicio1.main;

import org.example.level1.ejercicio1.exception.NotFoundException;
import org.example.level1.ejercicio1.model.Book;
import org.example.level1.ejercicio1.model.Library;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws NotFoundException {
        Library library = new Library();
        library.addBook(new Book("The Lord of the Rings", "Tolkien", "Fantasy"));
        library.addBook(new Book("Martian Chronicles", "Ray Bardbury", "Science Fiction"));
        library.addBook(new Book("1984", "Geoge Orwell", "Dystopic"));


        System.out.println("---------------------");

        library.getLibrarySize();

        System.out.println("---------------------");

        library.removeBook ("The Hobbit");

        library.getAllBooks();

        System.out.println("---------------------");

        library.getBookByPosition(0);

        System.out.println("---------------------");

        library.getBooksByTitle("1984");
        library.getBooksByTitle("The Lord of the Rings");

        System.out.println("---------------------");

        List <Book> positionBooks = new ArrayList<>();
        library.addABookWithAPosition(positionBooks,2,"Rayuela","Julio Cortazar","Fiction");

    }
    }
