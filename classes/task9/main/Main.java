package by.ld.hw.classes.task9.main;

import by.ld.hw.classes.task9.bean.Book;
import by.ld.hw.classes.task9.bean.BookList;
import by.ld.hw.classes.task9.logic.BookListLogic;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {
    public static void main(String[] args) {

        BookList books;
        BookListLogic bookListLogic;
        BookList writtenByAuthor;
        BookList booksByPublisher;
        BookList booksPublishedAfterYear;

        books = new BookList();
        books.addBook(new Book("Catch-22", "Simon & Schuster",
                1961, 453, 25.40, "Hardback", "Joseph Heller"));
        books.addBook(new Book("World War Z", "Crown",
                2006, 342, 12.50, "Paperback", "Max Brooks"));
        books.addBook(new Book("Roadside Picnic", "Macmillan",
                1972, 202, 20.10, "Hardback", "Arkadiy Strugatsky", "Boris Strugatsky"));
        books.addBook(new Book("Gone Girl", "Crown",
                2012, 409, 18.60, "Paperback", "Gillian Flynn"));
        books.addBook(new Book("Sharp Objects", "Crown",
                2006, 380, 14.15, "Paperback",  "Gillian Flynn"));
        books.addBook(new Book("Dark Places", "Crown",
                2009, 450, 15.90, "Paperback", "Gillian Flynn"));

        bookListLogic = new BookListLogic();
        System.out.println("Here is the list of all books: ");
        bookListLogic.printBooks(books);

        System.out.println("\n\nLet's find all books written by Gillian Flynn");
        writtenByAuthor = bookListLogic.findByAuthor(books, "Gillian Flynn");
        bookListLogic.printBooks(writtenByAuthor);

        System.out.println("\n\nLet's find all books published by Crown publishing house");
        booksByPublisher = bookListLogic.findByPublishingHouse(books, "Crown");
        bookListLogic.printBooks(booksByPublisher);

        System.out.println("\n\nLet's find all books published after 2000: ");
        booksPublishedAfterYear = bookListLogic.findFromYear(books, 2000);
        bookListLogic.printBooks(booksPublishedAfterYear);


    }
}
