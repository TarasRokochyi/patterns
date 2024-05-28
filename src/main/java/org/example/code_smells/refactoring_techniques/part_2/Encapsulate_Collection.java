package org.example.code_smells.refactoring_techniques.part_2;

import java.util.List;

public class Encapsulate_Collection {

    public class Book{
        public String name;

    }

    public class Library {
        private List<Book> books;
        public Library(List<Book> books) {
            this.books = books;
        }
        public List<Book> getBooks() {
            return books;
        }

        public void addBook(Book book){
            getBooks().add(book);
        }

        public void removeBook(Book book){
            getBooks().remove(book);
        }

    }
}
