package se.lexicon.michelle.books;

import java.util.Arrays;

public class ChildBook extends Book{
    private  ChildBook[] childBooks;


    public ChildBook(String title, String author, String category, int year, int pages) {
        super(pages);
        setTitle(title);
        setAuthor(author);
        setCategory(category);
        setYear(year);
        setPages(pages);
        childBooks = new ChildBook[0];
    }

    public ChildBook[] getChildBooks() {
        return childBooks;
    }
    public  ChildBook addChildBook(String title, String author, String category, int year, int pages){
        ChildBook toAdd = new ChildBook(
            title,
            author,
            category,
            year,
            pages
        );
        /**
         * adds the new object to the children books array.
         */
        ChildBook[] newBooks = Arrays.copyOf(childBooks , childBooks.length + 1);
        newBooks[newBooks.length - 1] = toAdd;
        childBooks = newBooks;
        /**
         * return newly created object
         */
        return  toAdd;
    }

    public void addChildBook(ChildBook toAdd){
        ChildBook[] newBooks = Arrays.copyOf(childBooks , childBooks.length + 1);
        newBooks[newBooks.length - 1] = toAdd;
        childBooks = newBooks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildBook: " );
        sb.append(Arrays.toString(childBooks));
        return sb.toString();
    }
}
