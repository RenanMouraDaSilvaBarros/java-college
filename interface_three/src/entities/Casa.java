package entities;

import interfaces.ITaxable;

public class Casa extends PropiedadeFixa implements ITaxable {
    protected double area;

    public Casa(String location, boolean inCity, double estimatedValue) {
        super(location, inCity, estimatedValue);
    }

    public double getArea() {
        return area;
    }

    @Override
    public double valorTaxa() {
        return 0D;
    }

    @Override
    public String dataVencimentoTaxa() {
        return "12/12/2020";
    }
}
