package services;

import entities.ContaCorrente;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import utils.Erro;
import utils.Minha;
import utils.Validar;
import view.View;

public class Services {

    public static ArrayList<Conta> contas = new ArrayList<Conta>();

    public static void registrar() {
        Minha.saida("----------------------------------------------------\n");

        Scanner entrada = new Scanner(System.in);
        boolean NaoValida = true;
        Conta conta = new Conta();

        Minha.saida("titular: ");
        conta.setTitular(entrada.nextLine());
        conta.setNumero(Minha.aleatorio(6));
        Minha.saida("Seu numero da conta: " + conta.getNumero());
        conta.setAgencia(Minha.aleatorio(3) + "-" + Minha.aleatorio(1));
        Minha.saida("Sua agencia: " + conta.getAgencia());

        while (NaoValida) {
            View.tipo();
            switch (entrada.next().charAt(0)) {
                case '1':
                    contas.add((ContaCorrente) conta);
                    Minha.saida(conta.toString());
                    NaoValida = false;
                    break;
                case '2':
                    contas.add((ContaPoupanca) conta);
                    Minha.saida(conta.toString());
                    NaoValida = false;
                    break;

                default:
                    Erro.ERRO("entrada inválida");
                    NaoValida = true;
            }
        }

        Erro.ERRO(Validar.SUCESSO);

        Minha.saida("----------------------------------------------------\n\n");
    }

}
