import java.util.ArrayList;

public class Borrower {
    private Book book;
    private ArrayList<Book> borrowersBooks;

    public Borrower(){
        borrowersBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> getBorrowersBooks() {
        return borrowersBooks;
    }
    public int borrowersBookCount(){
        return this.borrowersBooks.size();
    }
    public void addBook(Book book){
        this.borrowersBooks.add(book);
    }
    public void borrowBook(Library library){
        Book book = library.removeBook();
        this.borrowersBooks.add(book);
    }
}
