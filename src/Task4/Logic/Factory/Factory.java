package Task4.Logic.Factory;

import Task4.Entity.Books.Book;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.Formats;
import Task4.Entity.Magazines.Magazine;
import Task4.Entity.Parent.Polygraphy;
import Task4.Paths.Location;
import Task4.Logic.ReadFromFile.Reader;

public class Factory {

private static Reader reader = new Reader();

public Polygraphy getObj(Genres type){

    switch (type){
        case ROMAN:
            return new Book(reader.getArray(Location.deadSouls), Colors.GREEN, type);
        case HORROR:
            return new Book(reader.getArray(Location.stranger), Colors.YELLOW, type);
        case DRAMA:
            return new Book(reader.getArray(Location.nineteenEightyFour), Colors.BLUE, type);
        case NOVEL:
            return new Book(reader.getArray(Location.theDivineComedy), Colors.GREY, type);
        case FANTASTIC:
            return new Book(reader.getArray(Location.gameofThrones), Colors.RED, type);
        case FASHION:
            return new Magazine(reader.getArray(Location.vogue), Colors.BLUE, type, Formats.A3);
        case NEWS:
            return new Magazine(reader.getArray(Location.newsWeek), Colors.RED, type, Formats.A3);
        case INTERVIEW:
            return new Magazine(reader.getArray(Location.GQ), Colors.BLACK, type, Formats.A3);
        case REPORTAGE:
            return new Magazine(reader.getArray(Location.nationalGeographic), Colors.YELLOW, type, Formats.A4);
    }
    return null;
}

}
