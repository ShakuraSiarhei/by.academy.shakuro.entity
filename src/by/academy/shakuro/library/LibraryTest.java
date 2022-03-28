package by.academy.shakuro.library;

import java.util.Random;

public class LibraryTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Library l = new Library(10);
        for (int i = 0; i < l.books.length; i++) {
            if (i <= 7) {
            l.books[i] = new Book();
            l.books[i].setId(rand.nextInt(100000));
            l.books[i].setAuthor("J.R.Rouling");
            l.books[i].setName("Harry Potter part #" + (i + 1));
            l.books[i].setPublisher("Lalala" + rand.nextInt(2));
            l.books[i].setYear(1997 + i);
            l.books[i].setPrice(rand.nextInt(500) + 333);
            l.books[i].setNumberOfPages(666+ rand.nextInt(150));
            l.books[i].setTypeOfBind("Hard cover");
            } else {
                l.books[i] = new Book();
                l.books[i].setId(rand.nextInt(100000));
                l.books[i].setAuthor("Глуховский Д.А.");
                l.books[i].setName("Метро" + i + 2025);
                l.books[i].setPublisher("Что-то русское" + rand.nextInt(2));
                l.books[i].setYear(1996 + i);
                l.books[i].setPrice(rand.nextInt(250) + 333);
                l.books[i].setNumberOfPages(555+ rand.nextInt(150));
                l.books[i].setTypeOfBind("Soft cover");
            }
        }
        l.booksByAuthor("J.R.Rouling");
        System.out.println();
        l.booksByPublisher("Lalala1");
        System.out.println();
        l.booksByYear(2000);
    }
}
