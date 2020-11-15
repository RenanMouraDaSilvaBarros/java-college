public abstract class Employee {

    String name;
    String registration;

    public Employee(String name, String registration) {
        this.name = name;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", registration=" + registration + "]";
    }

}
