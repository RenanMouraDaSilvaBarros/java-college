package utils;

import entities.Conta;

public class Validar {

    public static final String SUCESSO = "OPERAÇÃO REALIZADA COM SUCESSO!";
    public static String FALHA = "OPERAÇÃO FALHOU";

    public static boolean deposito(double depositar) {

        if (Enumero(depositar) && depositar > 0)
            return true;

        Erro.ERRO(FALHA);

        return false;
    }

    public static boolean saque(double saque, double saldo) {

        if (Enumero(saque) && saque <= saldo)
            return true;

        Erro.ERRO(FALHA);

        return false;
    }

    public static boolean Enumero(double value) {
        String entrada = String.valueOf(value);
        if (entrada == null)
            return false;
        String number = entrada.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

    public static boolean Etransferivel(double saldo, double tranferencia) {
        if (tranferencia <= 0) {
            Erro.ERRO(FALHA);
            return false;
        }
        return tranferencia <= saldo;
    }

    public static boolean transferencia(double saldo, double transferencia) {
        if (Enumero(saldo) && Enumero(transferencia)) {
            if (Etransferivel(saldo, transferencia)) {
                return true;
            }
        }
        Erro.ERRO(FALHA);
        return false;
    }

    public static boolean Enull(Conta conta) {
        return conta != null;
    }

}
