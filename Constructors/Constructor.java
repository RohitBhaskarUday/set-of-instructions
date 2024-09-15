package Constructors;

public class Constructor {
    String name;

    //whenever you a constructor manually default constructor is not added.

    Constructor(){
        //no argument constructor
        //but the user is defining it.
    }
    
    Constructor(String empName){
        name = empName;
        //
    } // now this is constructor overloaded.
    // we cannot override it because there will be naming convention error

    //private Constructor(){
    // this will only allow only for this class to create an object
    // we cannot create an object if we create a private constructor.
    // }

}
