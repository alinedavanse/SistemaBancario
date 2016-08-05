package br.trainee.aline.sistemaBancario;

import java.util.Scanner;

public class Funcionario {

	// Atributos do funcionário
	String nome;
	String departamento;
	double salario;
	double aumento;
	double ganhoAnual;
	String dataEntrada;
	String rg;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	public double getGanhoAnual() {
		return ganhoAnual;
	}

	public void setGanhoAnual(double ganhoAnual) {
		this.ganhoAnual = ganhoAnual;
	}

	// Método para ganhar aumento
	// void recebeAumento(double valor) {
	// this.salario = this.salario + valor;

	// }

	// Método que calcula aumento em meses
	void recebeAumento() {
		int mes = 0;

		System.out.print("Em número, digite o mês: ");
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
			nomeMes = "Março";
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
			aumento = this.salario + 200;
			System.out.println("Mês: " + nomeMes);
		} else if (mes >= 7 && mes <= 12) {
			aumento = this.salario + 500;
			System.out.println("Mês: " + nomeMes);
		}

	}

	// Método para calcular ganho anual
	void calculaGanhoAnual() {
		int mes = 0;

		System.out.print("Em número, digite o mês: ");
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
			nomeMes = "Março";
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
			ganhoAnual = aumento * 12;
		} else if (mes >= 7 && mes <= 12) {
			ganhoAnual = aumento * 12;
		}

	}

	// Método para mostrar dados do funcionário
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);
	}

}
