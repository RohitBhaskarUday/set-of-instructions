package basics;

public class Engineer implements InterfaceNonPrimitive{
    @Override
    public String profession() {
        return "Software Engineer Class inside";
    }
}


class Student{
    public static void main(String[] args) {
        InterfaceNonPrimitive softwareEngineer = new Engineer();
        InterfaceNonPrimitive teacher = new Teacher();
        Teacher t1 = new Teacher();
        Engineer e1 = new Engineer();

        //store the reference inside of the parent interface
        //but you cannot create an object for the parent interface.
    }
}
