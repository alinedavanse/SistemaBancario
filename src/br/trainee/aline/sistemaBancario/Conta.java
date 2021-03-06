package br.trainee.aline.sistemaBancario;

public class Conta {

	// Criando as vari�veis
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	private static int totalDeContas;

	/*
	 * Com esse c�digo, toda nova Conta criada j� ter� um novo Cliente
	 * associado, sem necessidade de instanci�lo logo em seguida da instancia��o
	 * de uma Conta. Cliente titular = new Cliente();
	 */
	Cliente titular;

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
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
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

	public double pegaSaldo() {
		return this.saldo;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	Conta() {
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	/*
	 * //Construtor Conta(Cliente titutar) { // faz mais uma s�rie de
	 * inicializa��es e configura��es this.titular = titutar; }
	 * 
	 * Conta(int numero, Cliente titular){ this(titular); // chama o construtor
	 * que foi declarado acima this.numero = numero; }
	 * 
	 */

	// M�todo saca
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}

	}

	public void sacar(double quantidade) {
		// posso sacar at� saldo+limite
		if (quantidade > this.limite) {
			System.out.println("N�o posso sacar fora do limite!");
		} else {
			this.saldo = this.saldo - quantidade;
			System.out.println("Novo saldo: " + this.saldo);
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

	// Toda array em Java tem um atributo que se chama length, e voc� pode
	// acess�-lo
	// para saber o tamanho do array ao qual voc� est� se referenciando naquele
	// momento
	void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/*
	 * void imprimeArray(int[] array) { for (int x : array) {
	 * System.out.println(x); }
	 */

}
