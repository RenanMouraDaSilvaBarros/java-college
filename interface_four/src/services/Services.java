package services;

import entities.ContaCorrente;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import utils.Erro;
import utils.Minha;
import utils.Validar;
import view.View;

public class Services {

    public static ArrayList<Conta> contas = new ArrayList<Conta>();

    public static void registrar() {

        Scanner entrada = new Scanner(System.in);
        boolean NaoValida = true;
        Conta conta = new Conta();

        Minha.saida("-------------------------CADASTRAR----------------------");

        Minha.saida("titular: ");
        conta.setTitular(entrada.nextLine());
        conta.setNumero(Minha.aleatorio(6));
        Minha.saida("numero da sua conta: " + conta.getNumero());
        conta.setAgencia(Minha.aleatorio(3) + "-" + Minha.aleatorio(1));
        Minha.saida("numero da sua agencia: " + conta.getAgencia());

        while (NaoValida) {
            View.tipo();
            switch (entrada.next().charAt(0)) {
                case '1':
                    ContaCorrente contaCorrente = new ContaCorrente();
                    contaCorrente.copiar(conta);
                    contas.add(contaCorrente);
                    Minha.saida(contaCorrente.toString());
                    NaoValida = false;
                    break;
                case '2':
                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                    contaPoupanca.copiar(conta);
                    contas.add(contaPoupanca);
                    Minha.saida(conta.toString());
                    NaoValida = false;
                    break;

                default:
                    Erro.ERRO("entrada inválida");
                    NaoValida = true;
            }
        }

        Minha.saida(Validar.SUCESSO);

    }

    public static void listar() {
        Minha.saida("-------------------------LISTAR----------------------");

        if (!contas.isEmpty()) {
            for (Conta e : contas) {
                Minha.saida(e.toString());
                Minha.saida("-----------------------------------------------");
            }
        } else {
            Erro.ERRO(Validar.FALHA);
        }

    }

    public static void menuDirecionar() {
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                registrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                System.exit(0);
                break;
        }

    }

}
