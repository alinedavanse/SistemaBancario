package br.trainee.aline.sistemaBancario;

public class Teste {

	public static void main(String[] args) {

		//Criando conta C1
		Conta c1 = new Conta();

		//Atribuindo valores
		c1.numero = 234563839;
		c1.dono = "Aline";
		c1.saldo = 5000.0;
		c1.limite = 3000.0;

		//Sa�da
		System.out.println("N�mero da conta: " + c1.numero);
		System.out.println("Dono: " + c1.dono);
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);

	}

}
