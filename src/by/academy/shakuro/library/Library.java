package by.academy.shakuro.library;

public class Library {
    private Book [] books;
    private boolean isFull = false;

    public Library(){}

    public Library(Book ...books) {
        this.books = books;
    }

    public Library(int capacityOfLibrary) {
        this.books = new Book[capacityOfLibrary];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public boolean isFull() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                setFull(false);
            } else {
                setFull(true);
            }
        }
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void addBook (Book book) {
        if (isFull()) {
            throw new RuntimeException("You can't add new book. Your library is full.");
        } else {
            int i = 0;
            while (books[i] != null) {
                i++;
            }
            books[i] = book;
            System.out.println("Ok. Book is here.");
        }
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
