package by.ld.hw.classes.task9.bean;

import java.util.ArrayList;

/**
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами.
 */

public class BookList {
    private ArrayList<Book> books;

    public BookList(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void setBook(int i, Book book){
        books.set(i, book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

}
