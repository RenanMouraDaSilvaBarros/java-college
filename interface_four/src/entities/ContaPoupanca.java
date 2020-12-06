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

    public void copiar(Conta conta) {
        this.numero = conta.getNumero();
        this.agencia = conta.getAgencia();
        this.titular = conta.getTitular();
        this.saldo = conta.getSaldo();
    }

    @Override
    public String toString() {
        return super.toString() + "(tipo: " + getTipo() + ")";
    }

}
