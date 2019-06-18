package Task4.tests;

import Task4.Entity.Books.Book;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book;
    private String[] param = {"/TITLE", "/NAME", "/15", "/1985", "/CITY", "/HOUSE"};

@Before
public void setUp() {
    book = new Book(param, Colors.RED, Genres.ROMAN);
}

@After
public void tearDown() {
    book = null;
}

@Test
public void getGenre() {
    assertEquals(Genres.ROMAN, book.getGenre());
}

@Test
public void getCoverColor() {
    assertEquals(Colors.RED, book.getCoverColor());
}

@Test
public void getType() {
    assertEquals(PublicationType.BOOK, book.getType());
}
}