package classes;

import interfaces.Administrator;
import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;

public class LibrarianAndAdministrator extends User implements Librarian, Administrator {

    private String name = super.getName();

    public LibrarianAndAdministrator(String name) {
        super(name);
    }

    // Administrator - найти книгу

    @Override
    public void findBook(Book book, Reader reader) {
        System.out.println("Администратор <" + this.getAdministratorName() + "> " +
                "ищет книгу [" + book.getName() + ", авт.: " + book.getAuthor() + "] для читателя <" + reader.getReaderName() + ">");
    }

    @Override
    // Administrator - выдать книгу
    public void giveBook(Book book, Reader reader) {
        System.out.println("Администратор <" + this.getAdministratorName() + "> " +
                "выдал книгу [" + book.getName() + ", авт.: " + book.getAuthor() + "]" +
                " читателю <" + reader.getReaderName() + ">");
    }

    // Administrator - напомнить о просрочке - объекту reader класса Reader
    @Override
    public void overdueNotification(Book book, Reader reader) {
        System.out.println("Администратор <" + this.getAdministratorName() + "> " +
                "напоминает читателю <" + reader.getReaderName() + ">, что нужно вернуть книгу [" + book.getName() + ", авт.: " + book.getAuthor() + "]" +
                " !!!");
    }

    // Administrator - вернуть имя
    @Override
    public String getAdministratorName() {
        return this.name;
    }

    // Librarian - вернуть имя
    @Override
    public String getLibrarianName() {
        return this.name;
    }

    // Librarian - заказ книгу Book book у поставщика Supplier supplier
    @Override
    public void placeAnOrderForABook(Book book, Supplier supplier) {
        System.out.println("Библиотекарь <" + this.getLibrarianName() + "> заказал у поставщика <" + supplier.getSupplierName() + "> книгу [" +
                book.getName() + ", автор: " + book.getAuthor() + "] по цене " + book.getPrice() + " руб. за штуку. ");
    }

}
