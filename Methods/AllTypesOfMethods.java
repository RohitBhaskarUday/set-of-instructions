package Methods;

public class AllTypesOfMethods {

    static int val = 20;
    int val1= 2;

    public void print(){ //user defined
        System.out.println("printing it is ");
    }

    public void maxValue(){
        System.out.println(Integer.MAX_VALUE); //system defined methods
    }

    //overloaded and over ridden methods

    public static void getAge(){  //static method this is and is associated with class no need to create an object
        System.out.println(20);

        val=30;
        //val1=3; // cannot access the non- static variable

        // but you can tell an object to access other methods

        AllTypesOfMethods variable = new AllTypesOfMethods();
        variable.maxValue();
        variable.print();
    }

    public static void main(String[] args) {

        AllTypesOfMethods obj1 = new AllTypesOfMethods();

        AllTypesOfMethods.getAge();// static can be called using class name.

        obj1.maxValue();

        System.out.println(val);
    }

}
