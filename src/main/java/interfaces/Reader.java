package interfaces;

import classes.Book;

public interface Reader {
    public void takeBook(Book book);

    public void readBook(Book book);

    public void returnBook(Book book);

    public String getReaderName();
}