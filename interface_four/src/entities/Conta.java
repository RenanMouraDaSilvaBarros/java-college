package entities;

import utils.Validar;

public class Conta {
    int numero;
    String agencia;
    String titular;
    double saldo;

    // construtores
    public Conta() {
        this.saldo = 0;
    }

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0;
    }

    // get e setts
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    // operações
    public void deposita(double value) {

        if (Validar.deposito(value)) {
            setSaldo(value);
        }
    }

    public void sacar(double value) {
        if (Validar.saque(value, saldo)) {
            setSaldo(value * -1);
        }
    }

    public void transfere(Conta favorecida, double transferencia) {
        if (Validar.transferencia(this.getSaldo(), transferencia)) {
            this.setSaldo(transferencia * -1);
            favorecida.setSaldo(transferencia);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + numero;
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((titular == null) ? 0 : titular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (numero != other.numero)
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        if (titular == null) {
            if (other.titular != null)
                return false;
        } else if (!titular.equals(other.titular))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
    }

}
