package by.academy.shakuro.library;

public class Library {
    Book [] books;

    public Library(){}

    public Library(Book ...books) {
        this.books = books;
    }

    public Library(int capacity) {
        this.books = new Book[capacity];
    }

    public void booksByAuthor (String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].toString());
            }
        }
    }

    public void booksByPublisher (String publisher) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i].toString());
            }
        }
    }

    public void booksByYear (int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() <= year) {
                System.out.println(books[i].toString());
            }
        }
    }

}
