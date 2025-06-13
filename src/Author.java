public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString() {
        return "Автор " + this.firstName + " " + this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return this.firstName.equals(c2.firstName) && this.lastName.equals(c2.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}
