package entities;

import interfaces.ITaxable;

public class Onibus extends Veiculo implements ITaxable {

    protected int numberOfSeats;

    public Onibus(int registrationNumber, double maxVelocity, double value) {
        super(registrationNumber, maxVelocity, value);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double valorTaxa() {
        return 52D;
    }

    @Override
    public String dataVencimentoTaxa() {
        return "20/01/3000";
    }
}
