import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(Library library1) {
        this.borrowedBooks.add(library1.checkBookOut());
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

}
