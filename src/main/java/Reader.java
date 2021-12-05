public class Reader {

//    1."Читатели библиотеки". Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//    ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
//    Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
//            - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение
//        "Петров В. В. взял 3 книги".
//            - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//            - takeBook, который будет принимать переменное количество объектов класса Book
//            (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

//    Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение
//    "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
//    Каждый класс должен иметь метод getInfo() который выводит все поля этого класса

    private String nameSurname;
    private int ticketNumber;
    private String faculty;
    private String birthDay;
    private String phoneNUmber;

    public Reader(String nameSurname, int ticketNumber, String faculty, String birthDay, String phoneNUmber) {
        this.nameSurname = nameSurname;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phoneNUmber = phoneNUmber;
    }

    public void takeBook(int booksCount) {
        System.out.println(nameSurname + " взял " + booksCount + " книги.");

    }

    public void takeBook(String... book) {
        System.out.println(nameSurname + " взял следующие книги: ");
        for (String books : book) {
            System.out.println(books);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(nameSurname + " взял следующие книги: ");
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
    }

    public void returnBook(int returnBooksCount) {
        System.out.println(nameSurname + " вернул " + returnBooksCount + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(nameSurname + " вернул книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(nameSurname + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " автора " + book.getAuthor());
        }
    }

    public String getInfo() {
        return "Читатель " + nameSurname + " с факультета '" + faculty + "' имеет читательский билет № " + ticketNumber
                + ". ДР: " + birthDay + ". Контактный телефон: " + phoneNUmber;
    }

}
