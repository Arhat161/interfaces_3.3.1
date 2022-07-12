import classes.*;

public class Main {

    public static void main(String[] args) {

        Book bookOne = new Book("Таинственный остров", "Жюль Верн", 650);
        Book bookTwo = new Book("Игра престолов", "Джордж Рэймонд Ричард Мартин", 950);

        SupplierAndReader supplierAndReader = new SupplierAndReader("ИП Сидоров С.С.");
        LibrarianAndAdministrator librarianAndAdministrator = new LibrarianAndAdministrator("Иван Фёдорович");

        System.out.println();

        librarianAndAdministrator.findBook(bookOne, supplierAndReader);
        librarianAndAdministrator.giveBook(bookOne, supplierAndReader);
        supplierAndReader.takeBook(bookOne);
        supplierAndReader.readBook(bookOne);
        librarianAndAdministrator.overdueNotification(bookOne, supplierAndReader);
        supplierAndReader.returnBook(bookOne);
        librarianAndAdministrator.placeAnOrderForABook(bookTwo, supplierAndReader);
        supplierAndReader.supplyBookToThelibrary(bookTwo, librarianAndAdministrator);
    }
}