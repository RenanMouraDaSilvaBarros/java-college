package entities;

public class Veiculo {

    protected int registrationNumber;
    protected double maxVelocity;
    protected double value;

    public Veiculo(int registrationNumber, double maxVelocity, double value) {
        this.registrationNumber = registrationNumber;
        this.maxVelocity = maxVelocity;
        this.value = value;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

}
