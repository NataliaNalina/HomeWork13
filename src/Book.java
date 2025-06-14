public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getName() {
        return  name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear(){
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Произведение " + this.name + " год издания " + this.publishingYear + " " + author.toString() ;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return this.publishingYear == c2.publishingYear && this.name.equals(c2.name) && this.author.equals(c2.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, publishingYear, author);
    }
}