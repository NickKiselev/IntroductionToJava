package Task4.Main;

import Task4.Logic.Factory.Factory;
import Task4.Logic.Search.AddToArrayList;
import Task4.Logic.Search.SearchByColor;
import Task4.Logic.Search.SearchByFormat;
import Task4.Logic.Search.SearchByGenre;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.Formats;
import Task4.Entity.Parent.Polygraphy;
import Task4.Logic.Sort.AlphabetComparator;
import java.util.logging.Logger;

public class Main {

private static final Logger log = Logger.getLogger(String.valueOf(Main.class));

public static void main(String[] args) {
    start();
}

private static void start() {

    Factory factory = new Factory();

    Polygraphy book1 = factory.getObj(Genres.DRAMA);
    Polygraphy book2 = factory.getObj(Genres.FANTASTIC);
    Polygraphy book3 = factory.getObj(Genres.HORROR);
    Polygraphy book4 = factory.getObj(Genres.ROMAN);

    Polygraphy mag1 = factory.getObj(Genres.FASHION);
    Polygraphy mag2 = factory.getObj(Genres.INTERVIEW);
    Polygraphy mag3 = factory.getObj(Genres.NEWS);
    Polygraphy mag4 = factory.getObj(Genres.REPORTAGE);

    System.out.println("READ THE TOTAL NUMBER OF PAGES BY GENRE");
    System.out.println("---------------------------------------");
    sortByGenreBooks(book1, book2, book3, book4);
    sortByGenreMagazines(mag1, mag2, mag3, mag4);

    System.out.println("---------------------------------------");
    System.out.println("SORTING BOOKS BY ALPHABET");
    System.out.println("---------------------------------------");
    sortBooksByAlphabet(book1, book2, book3, book4);

    System.out.println("---------------------------------------");
    System.out.println("SEARCHING BOOKS BY YELLOW COLOR");
    System.out.println("---------------------------------------");
    searchingBooksByColor(book1, book2, book3, book4);

    System.out.println("---------------------------------------");
    System.out.println("SEARCHING MAGAZINES BY RED COLOR");
    System.out.println("---------------------------------------");
    searchingMagazinesByColor(mag1, mag2, mag3, mag4);

    System.out.println("---------------------------------------");
    System.out.println("SEARCHING MAGAZINES BY FORMATS");
    System.out.println("---------------------------------------");
    searchingMagazinesByFormat(mag1, mag2, mag3, mag4);
    System.out.println("---------------------------------------");
}

private static void sortByGenreBooks(Polygraphy b1, Polygraphy b2, Polygraphy b3,Polygraphy b4) {
    SearchByGenre search = new SearchByGenre();
    search.searchPagesByGenreBooks(new AddToArrayList().addToList(b1, b2, b3, b4));

    log.info("info sortByGenre");
}

private static void sortByGenreMagazines(Polygraphy m1, Polygraphy m2, Polygraphy m3, Polygraphy m4) {
    SearchByGenre search = new SearchByGenre();
    search.searchPagesByGenreMag(new AddToArrayList().addToList(m1, m2, m3, m4));

    log.info("info sortByGenre");
}

private static void sortBooksByAlphabet(Polygraphy b1, Polygraphy b2, Polygraphy b3, Polygraphy b4) {
    AlphabetComparator aC = new AlphabetComparator();
    aC.addToTreeSet(new AddToArrayList().addToList(b1, b2, b3, b4));

    log.info("info sortByAlphabet");
}

private static void searchingBooksByColor(Polygraphy b1, Polygraphy b2, Polygraphy b3, Polygraphy b4) {

    SearchByColor searchByColor = new SearchByColor();
    searchByColor.searchByColor(Colors.YELLOW, new AddToArrayList().addToList(b1, b2, b3, b4));

    log.info("info sortByColor");
}

private static void searchingMagazinesByColor(Polygraphy m1, Polygraphy m2, Polygraphy m3, Polygraphy m4) {

    SearchByColor searchByColor = new SearchByColor();
    searchByColor.searchByColor(Colors.RED, new AddToArrayList().addToList(m1, m2, m3, m4));

    log.info("info sortByColor");
}

private static void searchingMagazinesByFormat(Polygraphy m1, Polygraphy m2, Polygraphy m3, Polygraphy m4) {

    SearchByFormat searchByFormat = new SearchByFormat();
    searchByFormat.searchByFormat(Formats.A3, new AddToArrayList().addToList(m1, m2, m3, m4));

    log.info("info sortByFormat");
}
}
