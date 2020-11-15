package entities;

public class Employee extends Person {

    String addimission;
    double salary;

    public Employee(String name, int identity, String birth, double salary, String addmission) {
        super(name, identity, birth);
        this.addimission = addmission;
        this.salary = salary;
    }

    double whatSalary() {
        return salary;
    }

    public String getAddimission() {
        return addimission;
    }

    public void setAddimission(String addimission) {
        this.addimission = addimission;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "employee [addimission=" + addimission + ", salary=" + salary + "] ";
    }

}
