package TestPackage;

import AccessSpecifiers.Person;

public class Human extends Person {

    public void getDetails(){
       getProfession();
       // you can access the protectd method inside a child class like this within a method.
        //getAge is not possible

    }




}
