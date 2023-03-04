import exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Remarque", "The Arch of Triumph"));
        books.add(new Book("Remarque", "All quiet on the western front"));
        books.add(new Book("Zamyatin", "We"));
        books.add(new Book("William Gibson", "Neuromancer"));
        books.add(new Book("Arkady Strugatsky", "Hard to be a God"));
        books.add(new Book("Hakob Dyumejyan", "The Art of Exceptions"));
        books.add(new Book("Machiavelli", "The Prince"));
        books.add(new Book("Edgar Allan Poe", "The Mask of Red Death"));

        Library library = new Library();

        library.setBooks(books);

        User user = new User();

            user.getBook("Remarque", "The Arch of Triumph",library);
            user.getBook("Hakob Dyumejyan", "The Art of Exceptions",library);

        System.out.println( user.getUserBooks());
        System.out.println(library.getBooks());

            user.returnBook("Remarque", "The Arch of Triumph",library);

        System.out.println( user.getUserBooks());
        System.out.println(library.getBooks());

        System.out.println(books.size());

    }
}
