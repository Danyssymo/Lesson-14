package academy.olga.homework14.nine;

import java.util.Objects;

public class Book {
    private int id;
    private String bookName;
    private String bookAuthor;
    private int bookPublishing;
    private int yearPublishing;
    private int bookPages;
    private int bookPrice;
    private String bookBinding;

    public Book(int id, String bookName, String bookAuthor, int bookPublishing, int yearPublishing, int bookPages, int bookPrice, String bookBinding) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublishing = bookPublishing;
        this.yearPublishing = yearPublishing;
        this.bookPages = bookPages;
        this.bookPrice = bookPrice;
        this.bookBinding = bookBinding;
    }

    public Book(){

    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPublishing() {
        return bookPublishing;
    }

    public void setBookPublishing(int bookPublishing) {
        this.bookPublishing = bookPublishing;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookBinding() {
        return bookBinding;
    }

    public void setBookBinding(String bookBinding) {
        this.bookBinding = bookBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublishing=" + bookPublishing +
                ", yearPublishing=" + yearPublishing +
                ", bookPages=" + bookPages +
                ", bookPrice=" + bookPrice +
                ", bookBinding='" + bookBinding + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && bookPublishing == book.bookPublishing && yearPublishing == book.yearPublishing && bookPages == book.bookPages && bookPrice == book.bookPrice && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor) && Objects.equals(bookBinding, book.bookBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, bookAuthor, bookPublishing, yearPublishing, bookPages, bookPrice, bookBinding);
    }
}
