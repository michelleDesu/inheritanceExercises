package se.lexicon.michelle.books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChildBookTest {
    ChildBook
                childBook;
    ChildBook   storyBooks;

    @Before
    public void setUp() throws Exception {

        childBook = new ChildBook(
                "Äppelträdet",
                "Olle sandberg",
                "child book",
                2017,
                55
        );

        storyBooks = new ChildBook(
                "Samlade Sagor",
                "Michelle Johansson",
                "story book",
                2020,
                childBook.getPages()
        );
        storyBooks.addChildBook(childBook);




    }

    @Test
    public void getChildBooks() {
       ChildBook expected = new ChildBook(
                "Äppelträdet",
                "Olle sandberg",
                "child book",
                2017,
                55
        );

       assertArrayEquals(expected.getChildBooks(), childBook.getChildBooks());

    }

    @Test
    public void given_childBook_addChildBook() {
        ChildBook expected = new ChildBook(
                "Samlade Sagor",
                "Michelle Johansson",
                "story book",
                2020,
                childBook.getPages()
        );

        storyBooks.addChildBook(expected);
        ChildBook actual = storyBooks.getChildBooks()[storyBooks.getChildBooks().length -1];
        assertEquals(expected.toString(),actual.toString() );
    }

    @Test
    public void testAddChildBook() {
        ChildBook expected = new ChildBook(
                "how to not write classes",
                "Michelle Johansson",
                "child book",
                2020,
                100
        );
        ChildBook actual = storyBooks.addChildBook(
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

        System.out.println(childBook.toString());

        String expected = "title: " + childBook.getTitle() + "\n" +
                "author: " + childBook.getAuthor() + "\n" +
                "category: " + childBook.getCategory() + "\n" +
                "year: " + childBook.getYear() + "\n" +
                "pages: " + childBook.getPages() + "\n" +
                "\n";
        assertEquals(expected, childBook.toString());
    }

    @Test
    public void testEquals_and_hashcode() {
        // equals and hashCode check name field value
        ChildBook expected = new ChildBook(
                "how to not write classes",
                "Michelle Johansson",
                "child book",
                2020,
                100
        );
        assertTrue(expected.equals(childBook) && childBook.equals(expected));
        assertEquals(expected.hashCode(), childBook.hashCode());

    }
}