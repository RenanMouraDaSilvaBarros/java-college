package view;

import utils.Minha;

public class View {

	public static void inicial() {
		Minha.saida("Bem vindo! ao banco");
		Minha.saida("1-Cadastre-se");
		Minha.saida("2-Serviços da conta");
		Minha.saida("3-Listar todos os clientes");
		Minha.saida("4-Finalizar expediente");
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
