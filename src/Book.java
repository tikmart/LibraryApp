import java.util.IllegalFormatCodePointException;
import java.util.Objects;

public class Book {
    private String author;
    private String title;

    // checked in or checked out
    private Status status;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        status=Status.CHECKED_IN;
    }

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
            this.status = status;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


    public boolean equals(Object o) {
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title) ;
    }


}
