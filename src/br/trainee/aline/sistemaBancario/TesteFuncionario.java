package br.trainee.aline.sistemaBancario;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		// Cria funcionário f1
		Funcionario f1 = new Funcionario("Bianca", "TI", 6000);
		// Cria funcionário f2
		Funcionario f2 = new Funcionario("Jessica", "Recepcionista", 1000);
        //Cria data dataf1
		Data dataf1 = new Data();

		/*
		// Dados do funcionário f1
		f1.nome = "José";
		f1.departamento = "Gerente";
		f1.salario = 8000;
		// f1.dataEntrada = "04/08/2016";
		f1.rg = "3347583";
		

		// Dados do funcionario f2
		f2.nome = "Danilo";
		f2.departamento = "Correntista";
		f2.salario = 2500;
		// f2.dataEntrada = "04/08/2016";
		f2.rg = "223348";

		//Chama a data para funcionário f1
		f1.dataDeEntrada = dataf1;
		f1.dataDeEntrada.dia = 1;
		f1.dataDeEntrada.mes = 4;
		f1.dataDeEntrada.ano = 2016;
		f1.mostra();

		// Recebe aumento f1.recebeAumento(100);
		/*
		 * f1.recebeAumento(); System.out.println(
		 * "Aumento Mensal (Janeiro a Fevereiro): " + f1.aumentoMensal200);
		 * System.out.println("Aumento Mensal (Agosto a Dezembro): " +
		 * f1.aumentoMensal500); System.out.println(
		 * "Aumento em seis meses (Janeiro a Julho): " +
		 * f1.aumentoSeisMeses200); System.out.println(
		 * "Aumento em seis meses (Agosto a Dezembro): " +
		 * f1.aumentoSeisMeses500); System.out.println("Total: " +
		 * f1.somaMeses);
		 */

		// f1.calculaGanhoAnual();
		// System.out.println("Aumento: " + f1.aumentoSeisMeses);

		// Cálculo anual
		// f1.calculaGanhoAnual();
		// System.out.println("Anual: " + f1.ganhoAnual);

		// Mostra os dados do funcionário f
		// f1.mostra();

		// f1.mediaSalarios();
	}

}
