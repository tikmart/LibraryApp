import exceptions.ErrorMessage;
import exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();


    public void setBooks(List<Book> books) {

        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book checkOut(String author, String title) throws MyException {
        Book book = new Book(author, title);
        for (Book b : books) {
            if (b.getAuthor() == book.getAuthor() && b.getTitle() == book.getTitle())
                return book;

        }
        return null;
    }

    public void removeBook(Book book) {
        for (Book b : books) {
            if (b.getAuthor() == book.getAuthor() && b.getTitle() == book.getTitle()) {
                books.remove(b);
                book.setStatus(Status.CHECKED_OUT);
                break;
            }
        }

//        books.remove(book);

    }




}
