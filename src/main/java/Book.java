import java.time.LocalDate;

public class Book {
    public String name;
    public Author author;
    public int releaseYear;
    public int rating;
    public String text;

    public Book(String name, Author author, int releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = LocalDate.now().getYear();
        this.rating = 3;
        this.text = "";
        System.out.println("Бестселлер с названием " + "\"" + name + "\"" + " от бесподобного автора " + author.countBook + " книг(и) по имени " + author.toString() + " выпуска " + releaseYear + " года.");
    }

    public void up() {
        if (this.rating < 5) {
            this.rating++;
            System.out.println("Рейтинг книги " + "\"" + this + "\"" + " повысился: " + rating);
        }
    }

    public void down() {
        if (rating > 0) {
            rating--;
            System.out.println("Рейтинг книги " + "\"" + this + "\"" + " упал: " + rating);
        }
    }

    public void append(String moreText) {
        text += moreText;
        System.out.println("Дополнение к книге " + "\"" + this + "\"" + ":" + text);
    }

    public String toString() {
        return name;
    }
    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
