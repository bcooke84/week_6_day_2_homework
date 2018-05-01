import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> libraryStock;
    private int capacity;

    public Library(int capacity) {
        this.libraryStock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        this.libraryStock.add(book);
    }




}
