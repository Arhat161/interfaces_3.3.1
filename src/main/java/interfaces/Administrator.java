package interfaces;

import classes.Book;

public interface Administrator {
    public void findBook(Book book, Reader reader);

    public void giveBook(Book book, Reader reader);

    public void overdueNotification(Book book, Reader reader);

    public String getAdministratorName();
}