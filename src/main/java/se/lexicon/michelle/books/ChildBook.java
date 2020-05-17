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
        /*
         * adds the new object to the children books array.
         */
        ChildBook[] newBooks = Arrays.copyOf(childBooks , childBooks.length + 1);
        newBooks[newBooks.length - 1] = toAdd;
        childBooks = newBooks;
        /*
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
        sb.append("title: ").append(this.getTitle()).append("\n");
        sb.append("author: ").append(this.getAuthor()).append("\n");
        sb.append("category: ").append(this.getCategory()).append("\n");
        sb.append("year: ").append(this.getYear()).append("\n");
        sb.append("pages: ").append(this.getPages()).append("\n");
        sb.append("\n");
        for (ChildBook book: childBooks){
            sb.append("title: ").append(book.getTitle()).append("\n");
            sb.append("author: ").append(book.getAuthor()).append("\n");
            sb.append("category: ").append(book.getCategory()).append("\n");
            sb.append("year: ").append(book.getYear()).append("\n");
            sb.append("pages: ").append(book.getPages()).append("\n");
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildBook childBook = (ChildBook) o;
        return Arrays.equals(childBooks, childBook.childBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(childBooks);
    }
}
