
public class Main {
    public static void main(String[] args) {

        System.out.println("Home work class 2");

        Author williamShakespeare = new Author("William", "Shakespeare");
        Author agataChristie = new Author("Agata", "Christie");
        System.out.println(williamShakespeare);
        System.out.println(agataChristie);

        Book hamlet = new Book("Hamlet", williamShakespeare, 1623);
        Book tenLittleNiggers = new Book("Ten little niggers", agataChristie, 1939);

        System.out.println(hamlet);
        System.out.println(tenLittleNiggers);

        Author williamShakespeare1 = new Author("William", "Shakespeare");
        Book tenLittleNiggers1 = new Book("Ten little niggers", agataChristie, 1939);

        System.out.println("Автор williamShakespeare и williamShakespeare1 является одним и тем же автором  " + williamShakespeare.equals(williamShakespeare1));
        System.out.println("Книга tenLittleNiggers и tenLittleNiggers1 это одна и таже книга -" + tenLittleNiggers.equals(tenLittleNiggers1));

        System.out.println("Автор williamShakespeare и williamShakespeare1 является одним и тем же автором  " + (williamShakespeare.hashCode() == williamShakespeare1.hashCode()));
        System.out.println("Книга tenLittleNiggers и tenLittleNiggers1 это одна и таже книга -  " + (tenLittleNiggers.hashCode() == tenLittleNiggers1.hashCode()));

    }
}