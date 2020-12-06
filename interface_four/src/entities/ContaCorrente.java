package entities;

import constants.Tipo;
import interfaces.*;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double getValorImposto() {
        return 2D;
    }

    @Override
    public String getTitula() {
        return super.getTitular();
    }

    @Override
    public Tipo getTipo() {
        return Tipo.Corrente;
    }
}
