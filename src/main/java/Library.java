import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> libraryStock;
    private int capacity;
    private HashMap<String, Integer> genreStock;

    public Library(int capacity) {
        this.libraryStock = new ArrayList<>();
        this.capacity = capacity;
        this.genreStock = new HashMap<>();
    }

    public int bookCount() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        if (this.libraryStock.size() < this.capacity) {
            this.libraryStock.add(book);
            this.addToGenreStock(book);
        }
    }

    public Book checkBookOut() {
        Book newBook = this.libraryStock.remove(0);
        return newBook;
    }

    public void addToGenreStock(Book book) {
        if (genreStock.containsKey(book.getGenre())) {
        this.genreStock.put(book.getGenre(), this.genreStock.get(book.getGenre()) + 1); }
        else {
            this.genreStock.put(book.getGenre(), 1);
        }
    }

    public int getGenreStockValue(String genre) {
        return genreStock.get(genre);
    }


}


