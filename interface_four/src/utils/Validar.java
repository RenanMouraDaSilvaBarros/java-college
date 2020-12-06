package utils;

public class Validar {

    public static boolean deposito(double depositar) {

        if (Enumero(depositar) && depositar > 0)
            return true;

        Erro.ERRO("");

        return false;
    }

    public static boolean saque(double saque, double saldo) {

        if (Enumero(saque) && saque <= saldo)
            return true;

        Erro.ERRO("Seu saldo é insuficiente");

        return false;
    }

    public static boolean transferencia(double valor) {
        return false;
    }

    public static boolean Enumero(double value) {
        String entrada = String.valueOf(value);
        if (entrada == null)
            return false;
        String number = entrada.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

}
