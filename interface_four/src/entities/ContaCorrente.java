package entities;

import constants.Tipo;
import interfaces.*;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public void copiar(Conta conta) {
        this.numero = conta.getNumero();
        this.agencia = conta.getAgencia();
        this.titular = conta.getTitular();
        this.saldo = conta.getSaldo();
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

    @Override
    public String toString() {
        return super.toString() + "tipo: " + getTipo() + "\n";
    }

}
