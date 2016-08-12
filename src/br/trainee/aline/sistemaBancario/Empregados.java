package br.trainee.aline.sistemaBancario;

public class Empregados {

	String nome;
	String departamento;
	double salario;

	public Empregados(String nome, String departamento, double salario) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
	}

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

}
