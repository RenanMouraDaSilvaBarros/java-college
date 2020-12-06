package entities;

import constants.Tipo;
import interfaces.Tributavel;

public class SeguroVida implements Tributavel {
    String titular;
    int numeroApolice;
    double valor;

    public SeguroVida() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "SeguroVida [numeroApolice=" + numeroApolice + ", titular=" + titular + ", valor=" + valor + "]";
    }

    @Override
    public double getValorImposto() {
        return 5D;
    }

    @Override
    public String getTitula() {
        return getTitular();
    }

    @Override
    public Tipo getTipo() {
        return Tipo.Seguro;
    }
}
