package interfaces;

import classes.Book;

public interface Librarian {
    public void placeAnOrderForABook(Book book, Supplier supplier);

    public String getLibrarianName();
}
