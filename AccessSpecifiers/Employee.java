package AccessSpecifiers;

public class Employee {

    public static void main(String[] args) {

        Person per = new Person();
        per.getProfession();

        per.getAge(); // default method accessible within this package
    }
}
