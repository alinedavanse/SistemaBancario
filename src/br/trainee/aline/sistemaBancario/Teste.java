package br.trainee.aline.sistemaBancario;

public class Teste {

	public static void main(String[] args) {

		// Criando conta C1
		Conta c1 = new Conta();
		// Criando cliente cli1
		Cliente cli1 = new Cliente();
		// Criando Conta C2
		Conta c2 = new Conta();
		// Criando cliente cli2
		Cliente cli2 = new Cliente();

		// Atribuindo valores a Conta C1
		c1.numero = 234563839;
		c1.dono = "Aline";
		c1.saldo = 5000.0;
		c1.limite = 3000.0;

		// Atribuindo valores a Cliente cli1
		cli1.nome = "Aline";
		cli1.sobrenome = "Davanse";
		cli1.cpf = "672.862.846-78";

		// Atribuindo valores a Conta c2
		c2.numero = 224343456;
		c2.dono = "Maria";
		c2.saldo = 10000.0;
		c2.limite = 3000.0;

		// Atribuindo valores a Cliente cli2
		cli2.nome = "Maria";
		cli2.sobrenome = "Pereira";
		cli2.cpf = "758.123.456-98";

		System.out.println("-----CONTA 1 - ALINE--------");

		// Saída C1
		System.out.println("Número da conta: " + c1.numero);
		System.out.println("Dono: " + c1.dono);
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);

		System.out.println("-----CLIENTE 1 - ALINE --------");

		// Saída Cli1

		System.out.println("Nome: " + cli1.nome);
		System.out.println("Nome: " + cli1.sobrenome);
		System.out.println("Nome: " + cli1.cpf);

		System.out.println("-----CONTA 2 - MARIA --------");

		// Saída C2

		System.out.println("Número da conta: " + c2.numero);
		System.out.println("Dono: " + c2.dono);
		System.out.println("Saldo: " + c2.saldo);
		System.out.println("Limite: " + c2.limite);

		System.out.println("-----CLIENTE 2 - MARIA --------");

		// Saída Cli2

		System.out.println("Nome: " + cli2.nome);
		System.out.println("Nome: " + cli2.sobrenome);
		System.out.println("Nome: " + cli2.cpf);

		System.out.println("-----SAQUE--------");

		// Sacando R$1000.0 de R$5000.0
		c1.saca(1000.0);
		System.out.println("Novo saldo: " + c1.saldo);

		System.out.println("-----DEPÓSITO--------");

		// Depositando R$7000.0 numa conta que já possue saldo RS4000.0
		c1.deposita(7000.0);
		System.out.println("Novo saldo: " + c1.saldo);

		System.out.println("-----TRANSFERÊNCIA--------");

		// Transferindo R$3000.0 da Conta 1 para C2
		c1.tranfere(c2, 3000.0);
		System.out.println("Novo Saldo C1: " + c1.saldo);
		System.out.println("Novo Saldo C2: " + c2.saldo);

	}

}
