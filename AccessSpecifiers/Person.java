package AccessSpecifiers;

public class Person {

    //public means accessible throughout any package or any classes
    //private is applicable only for this particular class
    //protected means only accessible within the class but any other sub-class of this class can access that method when invoked into it.
    //DEFAULT MEANS ONLY ACCESSIBLE BY THIS PARTICULAR CLASS OR PACKAGE

    protected void getProfession(){
        System.out.println("inside person class");
        //EXAMPLE IS DONE INSIDE THE TEST PACKAGE HUMAN.
        return;
    }

    void getAge(){
        System.out.println("age");
    }



}
