package se.lexicon.michelle.books;

public abstract class Book {
    private String  title,
                    author,
                    category;
    private int     year,
                    pages;

    public Book(){
        setPages(100);
        setAuthor("Default");
        setCategory("Default");
        setTitle("Default");
        setYear(1970);
    }
    public Book(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
