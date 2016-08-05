package br.trainee.aline.sistemaBancario;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		// Cria funcionário f1
		Funcionario f1 = new Funcionario();
		// Cria funcionário f2
		Funcionario f2 = new Funcionario();

		// Dados do funcionário f1
		f1.nome = "José";
		f1.departamento = "Gerente";
		f1.salario = 8000;
		f1.dataEntrada = "04/08/2016";
		f1.rg = "3347583";

		// Dados do funcionario f2
		f2.nome = "Danilo";
		f2.departamento = "Correntista";
		f2.salario = 2500;
		f2.dataEntrada = "04/08/2016";
		f2.rg = "223348";

		// Recebe aumento f1.recebeAumento(100);

		f1.recebeAumento();
	    System.out.println("Aumento: " +f1.aumento);

		// Cálculo anual
		f1.calculaGanhoAnual();
		System.out.println("Anual: " + f1.ganhoAnual);

		// Mostra os dados do funcionário f
		// f1.mostra();

	}

}
