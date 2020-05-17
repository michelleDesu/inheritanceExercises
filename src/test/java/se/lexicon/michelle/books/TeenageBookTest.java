package se.lexicon.michelle.books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeenageBookTest {
    private TeenageBook teenageBook,
                        storyBooks;

    @Before
    public void setUp() throws Exception {
        teenageBook = new TeenageBook(
                "Äppelträdet",
                "Olle sandberg",
                "teenage book",
                2017,
                55
        );

        storyBooks = new TeenageBook(
                "Samlade Sagor",
                "Michelle Johansson",
                "teenage book",
                2020,
                teenageBook.getPages()
        );
        storyBooks.addTeenBook(teenageBook);

    }

    @Test
    public void getTeenageBook(){

        TeenageBook expected = new TeenageBook(
                "Äppelträdet",
                "Olle sandberg",
                "teenage book",
                2017,
                55
        );

        assertArrayEquals(expected.getTeenageBooks(), teenageBook.getTeenageBooks());
    }

    @Test
    public void given_TeenageBook_addTeenBook() {
        TeenageBook expected = new TeenageBook(
                "Samlade Sagor",
                "Michelle Johansson",
                "story book",
                2020,
                teenageBook.getPages()
        );

        storyBooks.addTeenBook(expected);
        TeenageBook actual = storyBooks.getTeenageBooks()[storyBooks.getTeenageBooks().length -1];
        assertEquals(expected.toString(),actual.toString() );
    }

    @Test
    public void testAddTeenBook() {
        TeenageBook expected = new TeenageBook(
                "how to not write classes",
                "Michelle Johansson",
                "child book",
                2020,
                100
        );
        TeenageBook actual = storyBooks.addTeenBook(
                expected.getTitle(),
                expected.getAuthor(),
                expected.getCategory(),
                expected.getYear(),
                expected.getPages()
        );

        assertEquals(expected.toString(),actual.toString() );
    }

    @Test
    public void testToString() {

        String expected = "title: " + teenageBook.getTitle() + "\n" +
                "author: " + teenageBook.getAuthor() + "\n" +
                "category: " + teenageBook.getCategory() + "\n" +
                "year: " + teenageBook.getYear() + "\n" +
                "pages: " + teenageBook.getPages() + "\n" +
                "\n";
        System.out.println(teenageBook.toString());
        assertEquals(expected, teenageBook.toString());
    }

    @Test
    public void testEquals_and_hashcode() {
        // equals and hashCode check name field value
        TeenageBook expected = new TeenageBook(
                "how to not write classes",
                "Michelle Johansson",
                "child book",
                2020,
                100
        );
        assertTrue(expected.equals(teenageBook) && teenageBook.equals(expected));
        assertEquals(expected.hashCode(), teenageBook.hashCode());

    }
}