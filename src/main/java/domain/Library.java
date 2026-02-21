package domain;
import domain.Book;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

public class Library {

    private ArrayList<Book> allBooks;

    public Library() {
        allBooks = new ArrayList<>();
        checkLibrary();
    }

    public int getSize() {
        return allBooks.size();
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public boolean containsBook(Book book) {
        return allBooks.contains(book);
    }

    public List<Book> getBooksByGenre(GenreType genre) {
        return allBooks.stream() .filter(book -> book.getGenreType() == genre) .toList();
    }

    public List<Book> getBooksByStatus(Status status) {
        return allBooks.stream() .filter(book -> book.getStatus() == status) .toList();
    }

    public List<Book> getBooksByRating(int rating) {
        return allBooks.stream() .filter(book -> book.getRating() == rating) .toList();
    }

    public void printBooks(List<Book> books) {
        books.forEach(System.out::println);
    }

    public void printAllBooks() {
        printBooks(allBooks);
    }

    private void checkLibrary(){
        Preconditions.checkNotNull(this.allBooks, "Books should not be null");

        for(Book book : allBooks){
            Preconditions.checkNotNull(book, "Individual books should not be null");
        }
    }
}
