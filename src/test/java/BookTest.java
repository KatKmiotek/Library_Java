import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void before(){
        book = new Book("Franz Kafka", "The Castle", "fiction");
    }
    @Test
    public void canGetTitle(){
        assertEquals("The Castle", book.getTitle());
    }
}
