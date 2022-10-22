import java.time.LocalDate;

public class Author {
    public String name;
    public String surname;
    public int countBook;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.countBook = 0;
    }

    public void newBook(String title) {
        new Book(title, this, LocalDate.now().getYear());
        countBook++;
    }

    public String toString() {
        return name + " " + surname;
    }
}