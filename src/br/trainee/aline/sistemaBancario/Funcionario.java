package br.trainee.aline.sistemaBancario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionario {

	// Atributos do funcion�rio
	String nome;
	String departamento;
	double salario;
	double ganhoAnual;
	String dataEntrada;
	String rg;
	double somaMeses;
	double aumentoMensal200;
	double aumentoMensal500;
	double aumentoSeisMeses200;
	double aumentoSeisMeses500;
	int quantidadeFuncionarios;
	double totalSalarios;
	double mediaSalarial;

	Data dataDeEntrada;

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public double getTotalSalarios() {
		return totalSalarios;
	}

	public void setTotalSalarios(double totalSalarios) {
		this.totalSalarios = totalSalarios;
	}

	public double getMediaSalarial() {
		return mediaSalarial;
	}

	public void setMediaSalarial(double mediaSalarial) {
		this.mediaSalarial = mediaSalarial;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getGanhoAnual() {
		return ganhoAnual;
	}

	public void setGanhoAnual(double ganhoAnual) {
		this.ganhoAnual = ganhoAnual;
	}

	public double getSomaMeses() {
		return somaMeses;
	}

	public void setSomaMeses(double somaMeses) {
		this.somaMeses = somaMeses;
	}

	public double getAumentoSeisMeses200() {
		return aumentoSeisMeses200;
	}

	public void setAumentoSeisMeses200(double aumentoSeisMeses200) {
		this.aumentoSeisMeses200 = aumentoSeisMeses200;
	}

	public double getAumentoMensal200() {
		return aumentoMensal200;
	}

	public void setAumentoMensal200(double aumentoMensal200) {
		this.aumentoMensal200 = aumentoMensal200;
	}

	public double getAumentoMensal500() {
		return aumentoMensal500;
	}

	public void setAumentoMensal500(double aumentoMensal500) {
		this.aumentoMensal500 = aumentoMensal500;
	}

	public double getAumentoSeisMeses500() {
		return aumentoSeisMeses500;
	}

	public void setAumentoSeisMeses500(double aumentoSeisMeses500) {
		this.aumentoSeisMeses500 = aumentoSeisMeses500;
	}

	// M�todo para ganhar aumento
	// void recebeAumento(double valor) {
	// this.salario = this.salario + valor;

	// }

	// M�todo que calcula aumento em meses 12
	void recebeAumento() {

		for (int mes = 1; mes <= 12; mes++) {

			// for(int mes = 1; mes <= 6, i++){
			// for(int mes = 7; mes <= 12; i++){
			System.out.print("Em n�mero, digite o m�s: ");
			Scanner scanner = new Scanner(System.in);
			mes = scanner.nextInt();

			String nomeMes = null;
			switch (mes) {
			case 1:
				nomeMes = "Janeiro";
				break;

			case 2:
				nomeMes = "Fevereiro";
				break;

			case 3:
				nomeMes = "Mar�o";
				break;

			case 4:
				nomeMes = "Abril";
				break;

			case 5:
				nomeMes = "Maio";
				break;

			case 6:
				nomeMes = "Junho";
				break;

			case 7:
				nomeMes = "Julho";
				break;

			case 8:
				nomeMes = "Agosto";
				break;

			case 9:
				nomeMes = "Setembro";
				break;

			case 10:
				nomeMes = "Outubro";
				break;

			case 11:
				nomeMes = "Novembro";
				break;

			case 12:
				nomeMes = "Dezembro";
				break;

			}

			if (mes >= 1 && mes <= 6) {
				aumentoMensal200 = this.salario + 200;
				somaMeses = somaMeses + aumentoMensal200;
				aumentoSeisMeses200 = aumentoSeisMeses200 + 200;

				System.out.println("M�s: " + nomeMes);

			} else if (mes >= 7 && mes <= 12) {

				aumentoMensal500 = this.salario + 500;
				somaMeses = somaMeses + aumentoMensal500;
				aumentoSeisMeses500 = aumentoSeisMeses500 + 500;

				System.out.println("M�s: " + nomeMes);

			} else if (mes == 0) {
				System.out.println("Aumento Mensal (Janeiro a Fevereiro): " + this.aumentoMensal200);
				System.out.println("Aumento Mensal (Agosto a Dezembro): " + this.aumentoMensal500);
				System.out.println("Aumento em seis meses (Janeiro a Julho): " + this.aumentoSeisMeses200);
				System.out.println("Aumento em seis meses (Agosto a Dezembro): " + this.aumentoSeisMeses500);
				System.out.println("Total: " + this.somaMeses);

				System.exit(0);

			}

		}
	}

	// M�todo para calcular ganho anual
	void calculaGanhoAnual() {
		ganhoAnual = aumentoSeisMeses200 + aumentoSeisMeses500 + this.salario;

	}

	// M�todo que calcule a m�dia de sal�rios de uma empresa, pedindo ao usu�rio
	// a grade de funcion�rios e os sal�rios
	void mediaSalarios() {
		int cont = 0;

		System.out.print("Digite a quantidade de funcion�rios: ");
		Scanner scanner = new Scanner(System.in);
		quantidadeFuncionarios = scanner.nextInt();

		while (cont < quantidadeFuncionarios) {
			cont = cont + 1;

			System.out.print("Digite o sal�rio: ");
			Scanner scanner1 = new Scanner(System.in);
			salario = scanner1.nextInt();

			totalSalarios = totalSalarios + salario;
		}
		mediaSalarial = totalSalarios / quantidadeFuncionarios;
		System.out.println("M�dia salarial: " + mediaSalarial);
	}

	// M�todo para mostrar dados do funcion�rio
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("Sal�rio: " + this.salario);
		System.out.println("RG: " + this.rg);

		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());

	}

	// M�todo para calcular ganho anual
	/*
	 * void calculaGanhoAnual() { int mes = 0;
	 * 
	 * System.out.print("Em n�mero, digite o m�s: "); Scanner scanner = new
	 * Scanner(System.in); mes = scanner.nextInt();
	 * 
	 * String nomeMes = null; switch (mes) { case 1: nomeMes = "Janeiro"; break;
	 * 
	 * case 2: nomeMes = "Fevereiro"; break;
	 * 
	 * case 3: nomeMes = "Mar�o"; break;
	 * 
	 * case 4: nomeMes = "Abril"; break;
	 * 
	 * case 5: nomeMes = "Maio"; break;
	 * 
	 * case 6: nomeMes = "Junho"; break;
	 * 
	 * case 7: nomeMes = "Julho"; break;
	 * 
	 * case 8: nomeMes = "Agosto"; break;
	 * 
	 * case 9: nomeMes = "Setembro"; break;
	 * 
	 * case 10: nomeMes = "Outubro"; break;
	 * 
	 * case 11: nomeMes = "Novembro"; break;
	 * 
	 * case 12: nomeMes = "Dezembro"; break;
	 * 
	 * } /* if (mes >= 1 && mes <= 6) { ganhoAnual = aumento * 6;
	 * System.out.println("M�s: " + nomeMes); } else if (mes >= 7 && mes <= 12)
	 * { ganhoAnual = aumento * 6; System.out.println("M�s: " + nomeMes); }
	 * 
	 * }
	 */

}
