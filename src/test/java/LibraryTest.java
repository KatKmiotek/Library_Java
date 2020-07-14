import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library collection;
    Borrower borrower;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before(){
        this.collection = new Library();
        this.book = new Book("Franz Kafka", "The Castle", "fiction");
        this.book1 = new Book("Franz Kafka", "America", "fiction");
        this.book2 = new Book("Malcolm Gladwell", "Talking to Strangers", "non-fiction");
        this.book3 = new Book("Malcolm Gladwell", "Outliers", "non-fiction");
        this.book4 = new Book("Bill Bryson", "Mother Tongue", "non-fiction");
        this.book5 = new Book("Lukasz Orbitowski", "Kult", "fiction");
        this.borrower = new Borrower();

    }
    @Test
    public void canCountBooks(){
        assertEquals(0, collection.booksCount());
    }
    @Test
    public void canAddBook(){
        collection.addBook(book);
        assertEquals(1, collection.booksCount());
    }
    @Test
    public void cantAddBook(){
        collection.addBook(book);
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);
        collection.addBook(book4);
        collection.addBook(book5);
        assertEquals(5, collection.booksCount());
    }

}
