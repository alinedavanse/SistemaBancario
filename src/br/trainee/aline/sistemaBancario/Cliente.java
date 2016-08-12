package br.trainee.aline.sistemaBancario;

import javax.swing.JOptionPane;

public class Cliente {

	// Criando as variáveis
	private String nome;
	private String sobrenome;
	private String endereco;
	private int idade;
	private String cpf;
	
	

	// Getters and setters

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	// Método para cadastrar cliente
	void cadastrarCliente(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;

		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("CPF:" + cpf);
	} // Fim do método para cadastrar cliente

	// Método para exibir cliente na tela
	boolean mostrarClientes() {

		JOptionPane.showMessageDialog(null, "Nome: " + this.getNome());
		JOptionPane.showMessageDialog(null, "Sobrenome: " + this.getSobrenome());
		JOptionPane.showMessageDialog(null, "CPF: " + this.getCpf());

		return true;
	}

	//Método que valida o CPF
	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}

		this.cpf = cpf;
		System.out.println("CPF: " +this.cpf);
	}

	//Método que valida CPF
	private void validaCPF(String cpf) {
		// série de regras aqui, falha caso não seja válido
	}
}

/*
 * boolean mostrarClientes() { boolean mostrou = false;
 * 
 * if (mostrou = false) { return false; } else {
 * 
 * JOptionPane.showMessageDialog(null, "Nome: " + this.getNome());
 * JOptionPane.showMessageDialog(null, "Sobrenome: " + this.getSobrenome());
 * JOptionPane.showMessageDialog(null, "CPF: " + this.getCpf());
 * 
 * return true; }
 */
