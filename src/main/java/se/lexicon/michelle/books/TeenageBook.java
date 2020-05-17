package se.lexicon.michelle.books;

import java.util.Arrays;

public class TeenageBook extends Book{
    private  TeenageBook[] teenageBooks;

    public TeenageBook( String title, String author, String category, int year, int pages) {
        super(pages);

        teenageBooks = new TeenageBook[0];
        setTitle(title);
        setAuthor(author);
        setCategory(category);
        setYear(year);

    }

    public String SearchTeenageBook(String title){
        StringBuilder found = new StringBuilder();
        TeenageBook foundBook = null;

        boolean isFound = false;
        for (TeenageBook book : teenageBooks){
            if (book.getTitle().equalsIgnoreCase(title) ){
                isFound = true;
                foundBook = book;
                break;
            }
        }
        if(isFound) {
            found.append("title: ").append(foundBook.getTitle()).append("\n");
            found.append("author: ").append(foundBook.getAuthor()).append("\n");
            found.append("category: ").append(foundBook.getCategory()).append("\n");
            found.append("year: ").append(foundBook.getYear()).append("\n");
            found.append("pages: ").append(foundBook.getPages()).append("\n");
            found.append("\n");
        } else{
            found.append("Book does not exist!\n");
        }

        return found.toString();
    }

    public TeenageBook[] getTeenageBooks() {
        return teenageBooks;
    }


    public  TeenageBook addTeenBook(String title, String author, String category, int year, int pages){
        TeenageBook toAdd = new TeenageBook(
                title,
                author,
                category,
                year,
                pages
        );
        /*
         * adds the new object to the children books array.
         */
        TeenageBook[] newBooks = Arrays.copyOf(teenageBooks , teenageBooks.length + 1);
        newBooks[newBooks.length - 1] = toAdd;
        teenageBooks = newBooks;
        /*
         * return newly created object
         */
        return  toAdd;
    }

    public void addTeenBook(TeenageBook toAdd){
        TeenageBook[] newBooks = Arrays.copyOf(teenageBooks , teenageBooks.length + 1);
        newBooks[newBooks.length - 1] = toAdd;
        teenageBooks = newBooks;
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
        for (TeenageBook book: teenageBooks){
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
        TeenageBook that = (TeenageBook) o;
        return Arrays.equals(teenageBooks, that.teenageBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(teenageBooks);
    }
}
