public class ExecutiveClass {

//    Третий исполняющий класс должен:
//      1. Создать как минимум 3 экземпляра класса Reader
//      2. Создать как минимум 3 экземпляра класса Book
//      3. Выполнить манипуляции с методами takeBook(), returnBook() для каждого Ридера
//      4. Должно быть два метода которые выводят список читателей и список книг (printBooks() и printReaders()
//         которые циклом вызывают getInfo())

    public static void main(String[] args) {

        Reader reader1 = new Reader("Иванов Илья", 100, "Философия", "12-12-2000", "+380504442211");
        Reader reader2 = new Reader("Старый Иван", 101, "Менеджмент", "02-03-1999", "+380509998800");
        Reader reader3 = new Reader("Горбунов Юрий", 102, "Логистика", "05-05-1999", "+30668805050");

        Book book1 = new Book("Высшая математика", "Онуфриенко А.В.");
        Book book2 = new Book("Основы экономической теории", "Волкова О.И.");
        Book book3 = new Book("Менеджмент ВЭД", "Леонов А.С.");


        reader1.takeBook(3);
        emptyLine("");
        reader1.returnBook(2);
        emptyLine("");
        reader2.takeBook("Приключения Электроника", "Остров сокровищ", "Робинзон Крузо");
        emptyLine("");
        reader2.returnBook("Оно", "Происхождение", "Робототехника");
        emptyLine("");
        reader3.takeBook(book1, book2, book3);
        emptyLine("");

        book1.setBookName("Всё об интегралах");
        book1.setAuthor("Ковалёв И.А.");
        book2.setBookName("Эконометрия");
        book2.setAuthor("Толбатов Ю.И.");
        reader3.returnBook(book1, book2);
        emptyLine("");

        printBooks(book1, book2, book3);
        emptyLine("");
        printReaders(reader1, reader2, reader3);


    }

    public static void emptyLine(String empty) {
        System.out.println("");
    }

    public static void printBooks(Book... books) {
        System.out.println("Список книг библиотеки: ");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }

    public static void printReaders(Reader... readers) {
        System.out.println("Список читателей библиотеки:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());

        }
    }
}



