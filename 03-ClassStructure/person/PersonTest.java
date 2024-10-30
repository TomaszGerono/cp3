package person;

public class PersonTest {
    public static void main(String[] args) {
        Person jan = new Person("Jan",85,185);
        Person zygmunt = new Person("Zygmunt",92,195);
        Person andrzej = new Person("Andrzej",76,174);

        jan.displayRecord();
        zygmunt.displayRecord();
        andrzej.displayRecord();
    }
}
