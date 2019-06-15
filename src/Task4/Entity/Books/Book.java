package Task4.Entity.Books;

import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import Task4.Entity.Parent.Polygraphy;

import java.util.Objects;

public class Book extends Polygraphy {

    private Genres genre;
    private Colors bookendColor;

    public Book(String[] param, Colors bookendColor, Genres genre) {
        super(param);
        this.bookendColor = bookendColor;
        this.genre = genre;
    }

    public Genres getGenre() {
        return genre;
    }

    public Colors getCoverColor() {
        return bookendColor;
    }

    public PublicationType getType(){
        return PublicationType.BOOK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return genre == book.genre &&
                bookendColor == book.bookendColor;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), genre, bookendColor);
    }


}
