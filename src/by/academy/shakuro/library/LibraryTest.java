package by.academy.shakuro.library;

import java.util.Random;

public class LibraryTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Library l = new Library(3);
        l.addBook(new Book(1, "Трудно быть богом", "Стругацкий", "Росмэн", 2000, 500, 200, "твердый" ));
        l.addBook(new Book(2, "Ведьмак", "Сапковский", "АТС", 1999, 567, 220, "твердый" ));
        l.addBook(new Book(3, "Гарри Поттер", "Роулинг", "Росмэн", 2000, 777, 499, "твердый" ));

        l.booksByAuthor("Роулинг");
        System.out.println();
        l.booksByPublisher("АТС");
        System.out.println();
        l.booksByYear(1999);

        l.addBook(new Book(4, "Что-то еще", "Рандомный автор", "Росмэн", 2000, 500, 200, "твердый" ));
    }
}
