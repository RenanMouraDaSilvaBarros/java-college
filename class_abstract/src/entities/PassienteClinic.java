
package entities;

import enums.HealthPlan;

public class PassienteClinic extends Person {

    HealthPlan healthPlan;

    public PassienteClinic(String name, int identity, String birth, HealthPlan healthPlan) {
        super(name, identity, birth);
        this.healthPlan = healthPlan;
    }

    @Override
    public String toString() {
        return super.toString() + " PassienteClinic [healthPlan=" + healthPlan + "] ";
    }
}
