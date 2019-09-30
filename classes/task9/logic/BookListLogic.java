package by.ld.hw.classes.task9.logic;

import by.ld.hw.classes.task9.bean.Book;
import by.ld.hw.classes.task9.bean.BookList;

import java.util.ArrayList;

/**
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class BookListLogic {

    public BookList findByAuthor(BookList list, String author){
        BookList foundBooks;
        String[] authors;
        ArrayList<Book> books;
        Book book;
        int length;

        foundBooks = new BookList();
        books = list.getBooks();
        length = books.size();

        for(int i = 0; i < length; i++){
            book = books.get(i);
            authors = book.getAuthors();
            for(int j = 0; j < authors.length; j++){
                if(authors[j].equals(author)){
                    foundBooks.addBook(book);
                }
            }
        }

        return foundBooks;
    }


    public BookList findByPublishingHouse(BookList list, String publishingHouse){
        BookList foundBooks;
        ArrayList<Book> books;
        Book book;
        int length;

        foundBooks = new BookList();
        books = list.getBooks();
        length = books.size();

        for(int i = 0; i < length; i++){
            book = books.get(i);
            if(book.getPublishingHouse().equals(publishingHouse)){
                foundBooks.addBook(book);
            }
        }

        return foundBooks;
    }


    public BookList findFromYear(BookList list, int year){
        BookList foundBooks;
        ArrayList<Book> books;
        Book book;
        int length;

        foundBooks = new BookList();
        books = list.getBooks();
        length = books.size();

        for(int i = 0; i < length; i++){
            book = books.get(i);
            if(book.getYearOfPublication() > year){
                foundBooks.addBook(book);
            }
        }

        return foundBooks;
    }


    public void printBooks(BookList list){
        ArrayList<Book> books;
        Book book;
        int length;

        books = list.getBooks();
        length = books.size();

        for(int i = 0; i < length; i++){
            book = books.get(i);
            System.out.println(book.toString());
        }
    }
}
