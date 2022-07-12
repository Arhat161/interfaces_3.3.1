package interfaces;

import classes.Book;

public interface Supplier {
    public void supplyBookToThelibrary(Book book, Librarian librarian);

    public String getSupplierName();
}