package entities;

import interfaces.ITaxable;

public class Moto extends Veiculo implements ITaxable {

    public Moto(int registrationNumber, double maxVelocity, double value) {
        super(registrationNumber, maxVelocity, value);
    }

    @Override
    public double valorTaxa() {
        return 12D;
    }

    @Override
    public String dataVencimentoTaxa() {
        return "14/02/2021";
    }
}
