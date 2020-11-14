package entities;

import java.util.Date;

public class Employee extends Person {

    Date addimission;
    double salary;

    public Employee(double salary, Date addmission) {
        this.addimission = addmission;
        this.salary = salary;
    }

    double whatSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "employee [addimission=" + addimission + ", salary=" + salary + "]";
    }

}
