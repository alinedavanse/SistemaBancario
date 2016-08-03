package br.trainee.aline.sistemaBancario;

import javax.swing.JOptionPane;

public class Conta {

	// Criando as v�riaveis
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;

	// Getters and setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// M�todo saca
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}

	}

	// M�todo deposita
	void deposita(double quantidade) {
		this.saldo = this.saldo + quantidade;

	}

	boolean tranfere(Conta destino, double quantidade) {
		boolean retirou = destino.saca(quantidade);

		if (retirou == false) {
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;
		}

	}

}
