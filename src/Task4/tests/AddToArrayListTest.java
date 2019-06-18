package Task4.tests;

import Task4.Entity.Books.Book;
import Task4.Entity.Parent.Polygraphy;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Logic.Search.AddToArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddToArrayListTest {
private AddToArrayList add;
private String[] param = {"/TITLE", "/NAME", "/15", "/1985", "/CITY", "/HOUSE"};

@Before
public void setUp() {
    add = new AddToArrayList();
}

@After
public void tearDown() {
    add = null;
}

@Test
public void addToList() {

    Polygraphy book1 = new Book(param, Colors.YELLOW, Genres.ROMAN);
    Polygraphy book2 = new Book(param, Colors.RED, Genres.ROMAN);
    Polygraphy book3 = new Book(param, Colors.YELLOW, Genres.HORROR);
    Polygraphy book4 = new Book(param, Colors.YELLOW, Genres.FANTASTIC);

    List<Polygraphy> expected = add.addToList(book1, book2, book3, book4);

    List<Polygraphy> actual = new ArrayList<>();
    actual.add(book1);
    actual.add(book2);
    actual.add(book3);
    actual.add(book4);

    assertEquals(expected, actual);
}
}