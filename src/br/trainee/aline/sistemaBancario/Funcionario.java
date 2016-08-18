package br.trainee.aline.sistemaBancario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionario {

	// Atributos do funcionário
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
	double quantidadeHoras;
	double salarioHora;
	int dependentes;
	double salarioBruto;
	double descontoINSS;
	double descontoIR;
	double salarioLiquido;

	Data dataDeEntrada;

	// Construtor recebendo três parâmetros
	public Funcionario(String nome, String departamento, double salario) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getDescontoIR() {
		return descontoIR;
	}

	public void setDescontoIR(double descontoIR) {
		this.descontoIR = descontoIR;
	}

	public double getDescontoINSS() {
		return descontoINSS;
	}

	public void setDescontoINSS(double descontoINSS) {
		this.descontoINSS = descontoINSS;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
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

	public Funcionario(String nome) {
		this.nome = nome;
	}

	// Método que calcula o salário líquido
	void salarioLiquido() {

		System.out.print("Digite a quantidade de horas trabalhadas: ");
		Scanner scanner = new Scanner(System.in);
		quantidadeHoras = scanner.nextInt();

		System.out.print("Digite o salário de horas trabalhadas: ");
		Scanner scanner1 = new Scanner(System.in);
		salarioHora = scanner1.nextInt();

		System.out.print("Digite o número de dependentes: ");
		Scanner scanner11 = new Scanner(System.in);
		dependentes = scanner11.nextInt();

		salarioBruto = quantidadeHoras * salarioHora + (50 * dependentes);

		System.out.println("Salário bruto: " + this.salarioBruto);

		if (salarioBruto <= 1000) {
			descontoINSS = salarioBruto * 8.5 / 100;

		} else {
			descontoINSS = salarioBruto * 9 / 100;
		}

		System.out.println("Desconto INSS: " + this.descontoINSS);

		if (salarioBruto <= 500) {
			descontoIR = 0;

		} else if ((salarioBruto > 500) && (salarioBruto <= 1000)) {
			descontoIR = salarioBruto * 5 / 100;

		} else {
			descontoIR = salarioBruto * 7 / 100;
		}

		System.out.println("Desconto IR: " + this.descontoIR);

		salarioLiquido = salarioBruto - descontoINSS - descontoIR;

		System.out.println("Salário líquido: " + this.salarioLiquido);

	}

	// Método para ganhar aumento
	// void recebeAumento(double valor) {
	// this.salario = this.salario + valor;

	// }

	// Método que calcula aumento em meses 12
	void recebeAumento() {

		for (int mes = 1; mes <= 12; mes++) {

			// for(int mes = 1; mes <= 6, i++){
			// for(int mes = 7; mes <= 12; i++){
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
				aumentoMensal200 = this.salario + 200;
				somaMeses = somaMeses + aumentoMensal200;
				aumentoSeisMeses200 = aumentoSeisMeses200 + 200;

				System.out.println("Mês: " + nomeMes);

			} else if (mes >= 7 && mes <= 12) {

				aumentoMensal500 = this.salario + 500;
				somaMeses = somaMeses + aumentoMensal500;
				aumentoSeisMeses500 = aumentoSeisMeses500 + 500;

				System.out.println("Mês: " + nomeMes);

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

	// Método para calcular ganho anual
	void calculaGanhoAnual() {
		ganhoAnual = aumentoSeisMeses200 + aumentoSeisMeses500 + this.salario;

	}

	// Método que calcule a média de salários de uma empresa, pedindo ao usuário
	// a grade de funcionários e os salários
	void mediaSalarios() {
		int cont = 0;

		System.out.print("Digite a quantidade de funcionários: ");
		Scanner scanner = new Scanner(System.in);
		quantidadeFuncionarios = scanner.nextInt();

		while (cont < quantidadeFuncionarios) {
			cont = cont + 1;

			System.out.print("Digite o salário: ");
			Scanner scanner1 = new Scanner(System.in);
			salario = scanner1.nextInt();

			totalSalarios = totalSalarios + salario;
		}
		mediaSalarial = totalSalarios / quantidadeFuncionarios;
		System.out.println("Média salarial: " + mediaSalarial);
	}

	// Método para mostrar dados do funcionário
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("Salário: " + this.salario);
		System.out.println("RG: " + this.rg);

		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());

	}

	// Método para calcular ganho anual
	/*
	 * void calculaGanhoAnual() { int mes = 0;
	 * 
	 * System.out.print("Em número, digite o mês: "); Scanner scanner = new
	 * Scanner(System.in); mes = scanner.nextInt();
	 * 
	 * String nomeMes = null; switch (mes) { case 1: nomeMes = "Janeiro"; break;
	 * 
	 * case 2: nomeMes = "Fevereiro"; break;
	 * 
	 * case 3: nomeMes = "Março"; break;
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
	 * System.out.println("Mês: " + nomeMes); } else if (mes >= 7 && mes <= 12)
	 * { ganhoAnual = aumento * 6; System.out.println("Mês: " + nomeMes); }
	 * 
	 * }
	 */

}
