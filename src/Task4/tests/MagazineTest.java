package Task4.tests;

import Task4.Entity.Magazines.Magazine;
import Task4.Enums.Colors;
import Task4.Enums.Formats;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.Format;

import static org.junit.Assert.*;

public class MagazineTest {
    private Magazine magazine;
    private String[] param = {"/TITLE", "/NAME", "/15", "145", "MAY"};

@Before
public void setUp() {
    magazine = new Magazine(param, Colors.YELLOW, Genres.FASHION, Formats.A4);
}

@After
public void tearDown() {
    magazine = null;
}

@Test
public void getFormat() {
    assertEquals(Formats.A4, magazine.getFormat());
}

@Test
public void getCoverColor() {
    assertEquals(Colors.YELLOW, magazine.getCoverColor());
}

@Test
public void getGenre() {
    assertEquals(Genres.FASHION, magazine.getGenre());
}

@Test
public void getType() {
    assertEquals(PublicationType.MAGAZINE, magazine.getType());
}
}