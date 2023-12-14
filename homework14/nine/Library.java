package academy.olga.homework14.nine;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> showAuthorBooks(String author) {
        List<Book> myBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookAuthor().equals(author)) {
                myBooks.add(books.get(i));
            }
        }
        return myBooks;
    }

    public List<Book> showBooksPublishing(int publishing) {
        List<Book> booksPublishing = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookPublishing() == publishing) {
                booksPublishing.add(books.get(i));
            }
        }
        return booksPublishing;
    }

    public List<Book> sortBooksByYears(int year) {
        List<Book> sortedBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYearPublishing()>year){
                sortedBooks.add(books.get(i));
            }
        }
        return sortedBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
