package br.trainee.aline.sistemaBancario;

public class Teste {

	public static void main(String[] args) {

		// Criando conta C1
		Conta c1 = new Conta();
		// Criando Conta C2
		Conta c2 = new Conta();

		// Atribuindo valores a Conta C1
		c1.numero = 234563839;
		c1.dono = "Aline";
		c1.saldo = 5000.0;
		c1.limite = 3000.0;

		// Atribuindo valores a Conta c2
		c2.numero = 224343456;
		c2.dono = "Maria";
		c2.saldo = 10000.0;
		c2.limite = 3000.0;

		// Saída C1
		System.out.println("Número da conta: " + c1.numero);
		System.out.println("Dono: " + c1.dono);
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);

		// Saída C2

		System.out.println("Número da conta: " + c2.numero);
		System.out.println("Dono: " + c2.dono);
		System.out.println("Saldo: " + c2.saldo);
		System.out.println("Limite: " + c2.limite);

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
