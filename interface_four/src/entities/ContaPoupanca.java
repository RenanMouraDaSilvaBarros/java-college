package entities;

import constants.Tipo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Tipo getTipo() {
        return Tipo.Poupanca;

    }

}
