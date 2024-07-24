import java.time.LocalDate;
import java.util.Objects;

public class ProgrammingLanguage {
    private String name;
    private String author;
    private LocalDate dateOfFirstVersion;

    public ProgrammingLanguage(String name, String author, LocalDate dateOfFirstVersion) {
        this.name = name;
        this.author = author;
        this.dateOfFirstVersion = dateOfFirstVersion;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateOfFirstVersion() {
        return dateOfFirstVersion;
    }

    public void setDateOfFirstVersion(LocalDate dateOfFirstVersion) {
        this.dateOfFirstVersion = dateOfFirstVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(author, that.author) && Objects.equals(dateOfFirstVersion, that.dateOfFirstVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, dateOfFirstVersion);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfFirstVersion=" + dateOfFirstVersion +
                '}';
    }
}