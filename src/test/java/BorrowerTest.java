import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    private Library collection;

    @Before
    public void before(){
        borrower = new Borrower();
        collection = new Library();
    }
    @Test
    public void canCountBorrowersBooks(){
        assertEquals(0, borrower.borrowersBookCount());
    }
    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.borrowersBookCount());
    }
    @Test
    public void canBorrowBook(){
        collection.addBook(book);
        borrower.borrowBook(collection);
        assertEquals(1, borrower.borrowersBookCount());
    }
}
