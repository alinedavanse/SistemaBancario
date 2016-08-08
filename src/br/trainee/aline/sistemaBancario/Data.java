package br.trainee.aline.sistemaBancario;

public class Data {

	int dia;
	int mes;
	int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	String formatada() {
		return (this.dia + "/" + this.mes + "/" + this.ano);

	}

}
