package entities;

import enums.Department;

public class DepartmentBoss extends Employee {

    Department department;
    Employee promotionToBoss;

    public DepartmentBoss(Employee promotionToBoss, Department department, String addmission) {
        super(promotionToBoss.name, promotionToBoss.identity, promotionToBoss.birth, promotionToBoss.salary,
                addmission);
        this.department = department;
        this.promotionToBoss = promotionToBoss;
    }

    Department whichDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "DepartmentBoss [department=" + department + ", promotionToBoss=" + promotionToBoss + "] ";
    }

}
