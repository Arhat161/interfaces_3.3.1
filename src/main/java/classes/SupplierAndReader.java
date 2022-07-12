package classes;

import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;

public class SupplierAndReader extends User implements Supplier, Reader {

    private String n = super.getName();

    public SupplierAndReader(String name) {
        super(name);
    }

    @Override
    // Reader - взять книгу
    public void takeBook(Book book) {
        System.out.println("Читатель <" + this.getReaderName() + "> взял почитать книгу [" + book.getName()
                + "], автор: " + book.getAuthor());
    }

    // Reader - читать книгу
    @Override
    public void readBook(Book book) {
        System.out.println("Читатель <" + this.getReaderName() + "> читает книгу [" + book.getName()
                + "], автора: " + book.getAuthor());
    }

    // Reader - вернуть книгу
    @Override
    public void returnBook(Book book) {
        System.out.println("Читатель <" + this.getReaderName() + "> вернул в библиотеку книгу [" + book.getName()
                + "], автор: " + book.getAuthor());
    }

    // Reader - вернуть имя читателя
    @Override
    public String getReaderName() {
        return this.n;
    }

    // Supplier - поставка книги Book book в библиотеку
    @Override
    public void supplyBookToThelibrary(Book book, Librarian librarian) {
        System.out.println("Поставщик <" + this.getSupplierName() + "> отгрузил книгу [" + book.getName() + ", авт.: " +
                book.getAuthor() + "] библиотекарю <" + librarian.getLibrarianName()
                + "] по цене " + book.getPrice() + " руб. за штуку.");
    }

    // Supplier - вернуть имя поставщика
    @Override
    public String getSupplierName() {
        return this.n;
    }

}