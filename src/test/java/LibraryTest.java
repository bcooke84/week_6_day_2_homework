import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before() {
        library1 = new Library(3);
        book1 = new Book("Thriller");
        book2 = new Book("Horror");
        book3 = new Book("Thriller");
        book4 = new Book("Crime");
    }

    @Test
    public void bookCount() {
        library1.addBook(book1);
        library1.addBook(book2);
        assertEquals(2, library1.bookCount());
    }

    @Test
    public void checkCapacityIsFull() {
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        assertEquals(3, library1.bookCount());
    }

    @Test
    public void checkBookOutFromLibrary() {
        library1.addBook(book1);
        library1.addBook(book2);
        library1.checkBookOut();
        assertEquals(1, library1.bookCount());
    }

    @Test
    public void getBooksByGenre() {
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        assertEquals(2, library1.getGenreStockValue(book1.getGenre()));
    }


}
