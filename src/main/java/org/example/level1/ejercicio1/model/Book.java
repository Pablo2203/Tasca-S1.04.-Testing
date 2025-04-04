package org.example.level1.ejercicio1.model;

public class Book {
    public String title;
    public String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }


    @Override
    public String toString() {
        return "Book{" +
                "Title: '" + title + '\'' +
                ", Author: '" + author + '\'' +
                ", Genre:' " + genre + '\'' +
                '}';
    }
}


