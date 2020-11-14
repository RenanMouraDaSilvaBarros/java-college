
package entities;

import enums.HealthPlan;

public class PassienteClinic extends Person {

    HealthPlan healthPlan;

    public PassienteClinic() {
    }

    @Override
    public String toString() {
        return "PassienteClinic [healthPlan=" + healthPlan + "]";
    }
}
