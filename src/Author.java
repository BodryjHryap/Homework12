import java.util.Objects;

public class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString(){
        return authorName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }
}
