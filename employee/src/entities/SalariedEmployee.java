public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String name, String registration, double weeklySalary) {
        super(name, registration);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return getWeeklySalary() * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
    }

}
