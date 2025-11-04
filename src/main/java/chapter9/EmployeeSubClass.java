package chapter9;

public class EmployeeSubClass extends PersonBaseClass{

    private  String employeeID;
    private  String employeeTitle;

    // create defult constructor
    public EmployeeSubClass() {

        // calling the second constructor of the base class
       super("Esoooooooo");
        System.out.println("EmployeeSubClass Constructor ");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }



}
