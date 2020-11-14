package entities;

import java.util.Date;

import enums.Department;

public class DepartmentBoss extends Employee {

    Department department;
    boolean promotionToBoss;

    public DepartmentBoss(double salary, Date addmission, Department department, boolean promotionToBoss) {
        super(salary, addmission);
        this.department = department;
        this.promotionToBoss = promotionToBoss;
    }

    public void whichDepartment() {

    }

    public void departmentBoss() {

    }

    @Override
    public String toString() {
        return "DepartmentBoss [department=" + department + ", promotionToBoss=" + promotionToBoss + "]";
    }

}
