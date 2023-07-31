package creational.builder;

import java.time.Year;

public class Client {
    public static void main(String[] args) {
        Book book = new Book.Builder("65876cghsks", "Apes of planet").build();
        System.out.println("The book without description:" + book.toString());

        Book newBook = new Book.Builder("cjbdgcuidsg", "Trojan horse")
                .genre("Thriller")
                .author("Sudhanshu")
                .description("This should be book description")
                .publishedYear(Year.now())
                .build();
        System.out.println("The book with description:" + newBook.toString());
    }
}
