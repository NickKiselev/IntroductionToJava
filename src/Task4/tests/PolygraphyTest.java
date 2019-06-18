package Task4.tests;

import Task4.Entity.Parent.Polygraphy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolygraphyTest {
    private Polygraphy polygraphy;
    private String[] param = {"/TITLE", "/NAME", "/15", "/1985", "/CITY", "/HOUSE"};

@Before
public void setUp() throws Exception {
    polygraphy = new Polygraphy(param);
}

@After
public void tearDown() throws Exception {
    polygraphy = null;
}

@Test
public void getAuthorName() {
    assertEquals("NAME", polygraphy.getAuthorName());
}

@Test
public void getNumOfPages() {
    assertEquals(15, polygraphy.getNumOfPages());
}

@Test
public void getYearOfPublishing() {
    assertEquals(1985, polygraphy.getYearOfPublishing());
}

@Test
public void getPublishingHouse() {
    assertEquals("HOUSE", polygraphy.getPublishingHouse());
}

@Test
public void getCityOfPublishing() {
    assertEquals("CITY", polygraphy.getCityOfPublishing());
}

@Test
public void getTitle() {
    assertEquals("TITLE", polygraphy.getTitle());
}

}