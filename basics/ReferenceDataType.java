package basics;

class Employee{
    int empId;
    public int setEmpId(int empId){
        this.empId = empId;
        return empId;
    }
}


public class ReferenceDataType {

    public static void main(String[] args) {

        Employee empObj = new Employee();
        Employee Obj1 = new Employee();
        Obj1.empId = 10;
        empObj.empId = 10;
        System.out.println("before changing the value it is "+empObj.empId);
        modify(empObj);
        System.out.println("after changing the value through Reference it is "+empObj.empId);

    }

    public static void modify(Employee employee){
        employee.empId = 20;
    }


}
