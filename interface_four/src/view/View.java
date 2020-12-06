package view;

import utils.Minha;

public class View {

	public static void inicial() {
		Minha.saida("Bem vindo! ao banco");
		Minha.saida("1-Criar conta");
		Minha.saida("2-Listar todos os clientes");
		Minha.saida("3-Finalizar expediente");
	}

	public static void servicos() {
		Minha.saida("1-Realizar depósito");
		Minha.saida("2-Realizar saque");
		Minha.saida("3-Extrato");
		Minha.saida("4-voltar");
	}

	public static void tipo() {
		Minha.saida("escolha o tipo da conta:");
		Minha.saida("1-corrente\t2-poupança");
	}

}
