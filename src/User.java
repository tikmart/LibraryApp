import exceptions.ErrorMessage;
import exceptions.MyException;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Book> userBooks = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(List<Book> userBooks) {
        this.userBooks = userBooks;
    }



    public Book getBook(String author, String title,Library library ) throws MyException {
            Book book = library.checkOut(author,title);
            if (book != null) {
                userBooks.add(book);
                library.removeBook(book);
                book.setStatus(Status.CHECKED_OUT);
            } else {
                throw new MyException(ErrorMessage.NOT_FOUND_BOOK);
            }
            return book;
    }

    public Book returnBook(String author, String title, Library library) {
        Book book= new Book(author,title);
        if (userBooks.contains(book)){
            userBooks.remove(book);
            library.getBooks().add(book);
            book.setStatus(Status.CHECKED_IN);
        }
        return book;
    }
}
