public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");
        Author dostoevsky = new Author("Федор", "Достоевский");

        Book mymy = new Book("Муму", turgenev, 1852);
        Book idiot = new Book("Идиот", dostoevsky, 1868);

        System.out.println("mymy.name = " + mymy.getName());
        //System.out.println("mymy.author = " + mymy.getAuthor().getFirstName() + " " + mymy.getAuthor().getLastName());
        System.out.println("mymy.year = " + mymy.getYear());
        mymy.setYear(1855);
        System.out.println("mymy.getYear() = " + mymy.getYear());

        System.out.println("idiot.name = " + idiot.getName());
        //System.out.println("idiot.author = " + idiot.getAuthor().getFirstName() + " " + idiot.getAuthor().getLastName());
        System.out.println("idiot.year = " + idiot.getYear());

        System.out.println(turgenev);
        System.out.println(dostoevsky);
        System.out.println(mymy);
        System.out.println(idiot);


        System.out.println(turgenev.hashCode());
        System.out.println(mymy.hashCode());
        System.out.println(mymy.equals(idiot));
        System.out.println(idiot.equals(idiot));
    }
}