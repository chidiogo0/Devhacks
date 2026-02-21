package domain;
import com.google.common.base.Preconditions;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Status status;
    private GenreType genreType;
    private int pageCount;
    private int rating;

    public Book(String title, String author, String isbn, Status status, GenreType genreType, int pageCount, int rating) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genreType = genreType;
        this.pageCount = pageCount;
        this.rating = rating;
        this.status = status;
        checkBook();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Status getStatus() {
        return status;
    }

    public GenreType getGenreType() {
        return genreType;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getRating() {
        return rating;
    }

    private void checkBook(){
        Preconditions.checkNotNull(title, "title shouldn't be  null");
        Preconditions.checkState(title.length()>0, "title shouldn't be empty");
        Preconditions.checkNotNull(author, "author shouldn't be null");
        Preconditions.checkState(author.length()>0, "author shouldn't be empty");
        Preconditions.checkNotNull(isbn, "isbn shouldn't be null");
        Preconditions.checkState(isbn.length()>0, "isbn shouldn't be empty");
        Preconditions.checkNotNull(genreType, "genreType shouldn't be null");
        Preconditions.checkState(pageCount>=10, "pageCount should be at least 0");
        Preconditions.checkState(rating>=0, "rating should be at least 0");
        Preconditions.checkNotNull(status, "status shouldn't be null");
    }

    public String toString(){
        return title + "\n Author: " + author + "\n ISBN: " + isbn + "\n Genre: " + genreType;
    }
}
