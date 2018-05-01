import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book book1;
    Book book2;

    @Before
    public void before() {
        library1 = new Library(5);
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void bookCount() {
        library1.addBook(book1);
        library1.addBook(book2);
        assertEquals(2, library1.bookCount());
    }


}
