import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookTest {
    Book book;
    @BeforeEach
    void addObject(){
        book = new Book("Rikky", new Author("King", "Big"), 1996);
    }

    @Test
    void up_UpRating(){
        int expectedRating = 4;
        book.up();
        Assertions.assertEquals(expectedRating, book.getRating());
    }
    @Test
    void down_DownRating(){
        int expectedRating = 2;
        book.down();
        Assertions.assertEquals(expectedRating, book.getRating());
    }
    @Test
    void getRating_checkRating (){
        int currentRating = 3;
        Assertions.assertEquals(currentRating, book.getRating());
    }

    @Test
    void append_AddText () {
        String addText = "add text";
        String expectedText = book.text + addText;
        book.append(addText);
        Assertions.assertEquals(expectedText, book.getText());
    }

}
