public class Book {
    private Book book;
    private String author;
    private String genre;
    private String title;

    public Book(String author, String title, String genre){
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public Book getBook() {
        return book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
