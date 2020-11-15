package entities;

public class BankLoan {

    public static double calculateLoan(Person person) {
        return 1000;
    }

    public static double calculateLoan(Employee employee) {
        double loan = 0;
        if (employee instanceof Employee) {
            return employee.salary * 2.0;
        } else if (employee instanceof DepartmentBoss) {
            return employee.salary * 4.0;
        }
        return loan;

    }
}
