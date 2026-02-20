import com.google.common.base.Preconditions;

public class Genre {

    private ArrayList<Book> listOfBook = new ArrayList<Book>();
    private GenreType type;

    public Genre(GenreType type){
        this.type = type;
    }

    public void addBook(Book b){
        //add book to list by genre
        Preconditions.checkNotNull(b, "Book cannot be null");

        if(b.getGenre() == this.type){
            listOfBook.add(b);
        }else{
            throw new InvalidGenreTypeException();
        }
    }

}