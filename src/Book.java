import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + '"' + bookName + '"' + ". Автор книги: " + authorName + ". Год издания: " + publishingYear + '.';
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return authorName.equals(c2.getAuthorName()) && bookName.equals(c2.getBookName()) && publishingYear == c2.publishingYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, bookName, publishingYear);
    }
}
