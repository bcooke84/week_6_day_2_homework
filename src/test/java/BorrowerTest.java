import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library1;
    Book book1;
    Book book2;
    Borrower borrower1;

    @Before
    public void before() {
        library1 = new Library(3);
        book1 = new Book("Thriller");
        book2 = new Book("Horror");
        borrower1 = new Borrower();
    }

    @Test
    public void addBookToCollection(){
        library1.addBook(book1);
        borrower1.addBook(library1);
        assertEquals(1, borrower1.bookCount());
    }

}
