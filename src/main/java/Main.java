public class Main {
    public static void main(String[] args) {
        Author authorSuper = new Author("Кларк", "Кент");
        authorSuper.newBook("Первый полет");
        authorSuper.newBook("Второй полет");
        Book bookSuper = new Book("Антошка", authorSuper, 2022);
        bookSuper.append("Проснулся Антошка, начал кодить, пить чай.");
        bookSuper.up();
        bookSuper.append(" Кодил, кодил, и кодить стало лень.");
        bookSuper.down();
        bookSuper.append(" Одумался, и продолжил кодить.");
        bookSuper.up();

    }
}
