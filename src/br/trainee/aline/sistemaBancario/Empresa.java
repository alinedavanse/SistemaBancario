package br.trainee.aline.sistemaBancario;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] funcinarios;
	int cont = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	//M�todo que adiciona funcion�rio
	void adiciona(Funcionario f) {

		if (cont > 10) {
			System.out.println("Cheio");
		} else {
			this.funcinarios[cont] = f;
			this.cont++;
		}
		
		//System.out.println("Cont: " +cont);
		

	}

	//M�todo que exibe o funcion�rio na posi��o
	void mostraFuncionarios() {
		for (int i = 0; i < this.funcinarios.length; i++) {
			System.out.println("Funcionario na posi��o: " + i);
		}
	}
}
