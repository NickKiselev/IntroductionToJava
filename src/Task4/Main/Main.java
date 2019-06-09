package Task4.Main;

import Task4.Books.Book;
import Task4.Search.SearchByColor;
import Task4.Search.SearchByFormat;
import Task4.Search.SearchByGenre;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Magazines.Formats;
import Task4.Magazines.Magazine;
import Task4.Parent.Polygraphy;
import Task4.Paths.Location;
import Task4.ReadFromFile.Reader;
import Task4.Sort.AlphabetComparator;

import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Reader reader = new Reader();

        Polygraphy book1 = new Book(reader.getArray(Location.deadSouls), Colors.GREEN, Genres.ROMAN);
        Polygraphy book2 = new Book(reader.getArray(Location.nineteenEightyFour), Colors.BLUE, Genres.DRAMA);
        Polygraphy book3 = new Book(reader.getArray(Location.stranger), Colors.YELLOW, Genres.HORROR);
        Polygraphy book4 = new Book(reader.getArray(Location.theCastle), Colors.YELLOW, Genres.ROMAN);
        Polygraphy book5 = new Book(reader.getArray(Location.theDivineComedy), Colors.GREY, Genres.NOVEL);
        Polygraphy book6 = new Book(reader.getArray(Location.clockworkOrange), Colors.YELLOW, Genres.COMEDY);
        Polygraphy book7 = new Book(reader.getArray(Location.theIdiot), Colors.RED, Genres.ROMAN);
        Polygraphy book8 = new Book(reader.getArray(Location.gameofThrones), Colors.RED, Genres.FANTASTIC);
        Polygraphy book9 = new Book(reader.getArray(Location.wfrontwchange), Colors.WHITE, Genres.DRAMA);

        Polygraphy mag1 = new Magazine(reader.getArray(Location.cosmopolitan), Colors.RED, Genres.FASHION, Formats.A3);
        Polygraphy mag2 = new Magazine(reader.getArray(Location.GQ), Colors.BLACK, Genres.INTERVIEW, Formats.A3);
        Polygraphy mag3 = new Magazine(reader.getArray(Location.nationalGeographic), Colors.YELLOW, Genres.REPORTAGE, Formats.A4);
        Polygraphy mag4 = new Magazine(reader.getArray(Location.people), Colors.WHITE, Genres.FASHION, Formats.A3);
        Polygraphy mag5 = new Magazine(reader.getArray(Location.newsWeek), Colors.RED, Genres.NEWS, Formats.A3);
        Polygraphy mag6 = new Magazine(reader.getArray(Location.times), Colors.RED, Genres.NEWS, Formats.A3);
        Polygraphy mag7 = new Magazine(reader.getArray(Location.vogue), Colors.BLUE, Genres.FASHION, Formats.A3);

        System.out.println("READ THE TOTAL NUMBER OF PAGES BY GENRE");
        System.out.println("---------------------------------------");
        sortByGenreBooks(book1, book2, book3, book4, book5, book6, book7, book8, book9);
        sortByGenreMagazines(mag1, mag2, mag3, mag4, mag5, mag6, mag7);

        System.out.println("---------------------------------------");
        System.out.println("SORTING BOOKS BY ALPHABET");
        System.out.println("---------------------------------------");
        sortBooksByAlphabet(book1, book2, book3, book4, book5, book6, book7, book8, book9);

        System.out.println("---------------------------------------");
        System.out.println("SEARCHING BOOKS BY YELLOW COLOR");
        System.out.println("---------------------------------------");
        searchingBooksByColor(book1, book2, book3, book4, book5, book6, book7, book8, book9);

        System.out.println("---------------------------------------");
        System.out.println("SEARCHING MAGAZINES BY RED COLOR");
        System.out.println("---------------------------------------");
        searchingMagazinesByColor(mag1, mag2, mag3, mag4, mag5, mag6, mag7);

        System.out.println("---------------------------------------");
        System.out.println("SEARCHING MAGAZINES BY FORMATS");
        System.out.println("---------------------------------------");
        searchingMagazinesByFormat(mag1, mag2, mag3, mag4, mag5, mag6, mag7);
        System.out.println("---------------------------------------");

        log.info("start");

    }

    private static void sortByGenreBooks(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                                        Polygraphy b4, Polygraphy b5, Polygraphy b6,
                                        Polygraphy b7, Polygraphy b8, Polygraphy b9){
        SearchByGenre search = new SearchByGenre();
        search.searchPagesByGenreBooks(search.addToBookArray(b1, b2, b3, b4, b5, b6, b7, b8, b9));

        log.info("info sortByGenre");

    }

    private static void sortByGenreMagazines(Polygraphy m1, Polygraphy m2, Polygraphy m3, Polygraphy m4,
                                             Polygraphy m5, Polygraphy m6, Polygraphy m7){
        SearchByGenre search = new SearchByGenre();
        search.searchPagesByGenreMag(search.addToMagArray(m1, m2, m3, m4, m5, m6, m7));

        log.info("info sortByGenre");

    }

    private static void sortBooksByAlphabet(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                                            Polygraphy b4, Polygraphy b5, Polygraphy b6,
                                            Polygraphy b7, Polygraphy b8, Polygraphy b9){
        AlphabetComparator aC = new AlphabetComparator();
        aC.addToTreeSet(b1, b2, b3, b4, b5, b6, b7, b8, b9);

        log.info("info sortByAlphabet");
    }

    private static void searchingBooksByColor(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                                              Polygraphy b4, Polygraphy b5, Polygraphy b6,
                                              Polygraphy b7, Polygraphy b8, Polygraphy b9){

        SearchByColor searchByColor = new SearchByColor();
        searchByColor.searchByColor(Colors.YELLOW, searchByColor.addToBookArray(b1, b2, b3, b4, b5, b6, b7, b8, b9));

        log.info("info sortByColor");
    }

    private static void searchingMagazinesByColor(Polygraphy m1, Polygraphy m2, Polygraphy m3,
                                                  Polygraphy m4, Polygraphy m5, Polygraphy m6,
                                                  Polygraphy m7){

        SearchByColor searchByColor = new SearchByColor();
        searchByColor.searchByColor(Colors.RED, searchByColor.addToMagArray(m1, m2, m3, m4, m5, m6, m7));

        log.info("info sortByColor");
    }

    private static void searchingMagazinesByFormat(Polygraphy m1, Polygraphy m2, Polygraphy m3,
                                                   Polygraphy m4, Polygraphy m5, Polygraphy m6,
                                                   Polygraphy m7){

        SearchByFormat searchByFormat = new SearchByFormat();
        searchByFormat.searchByFormat(Formats.A3, searchByFormat.addToMagArray(m1, m2, m3, m4, m5, m6, m7));

        log.info("info sortByFormat");
    }
}
