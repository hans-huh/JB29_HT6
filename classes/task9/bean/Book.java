package by.ld.hw.classes.task9.bean;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString().
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 */

public class Book {
    private static int idCounter = 0;
    private int bookID;
    private String bookName;
    private String publishingHouse;
    private int yearOfPublication;
    private int pageCount;
    private double price;
    private String bookCoverType;
    private String[] authors;

    public Book(String bookName, String publishingHouse, int yearOfPublication, int pageCount, double price,
                String bookCoverType, String... authors){
        bookID = ++idCounter;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.pageCount = pageCount;
        this.price = price;
        this.bookCoverType = bookCoverType;
        this.authors = authors;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookCoverType() {
        return bookCoverType;
    }

    public void setBookCoverType(String bookCoverType) {
        this.bookCoverType = bookCoverType;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString(){
        String bookAuthors;

        bookAuthors = "";
        for(int i = 0; i < authors.length; i++){
            bookAuthors = authors[i];
            if(i + 1 < authors.length){
                bookAuthors += "; ";
            }
        }
        return "Book: " + bookName + "; id: " + bookID + "; authors: " + bookAuthors + "; publishing house: " +
                publishingHouse + "; year of publication: " + yearOfPublication + ", number of pages:  " +
                pageCount + "; price: " + price + "; cover type: " + bookCoverType;
    }
}
