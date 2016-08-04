package br.trainee.aline.sistemaBancario;

import javax.swing.JOptionPane;

public class Cliente {

	// Criando as variáveis
	String nome;
	String sobrenome;
	String cpf;

	// Getters and setters
	public String getNome() {
		return nome;
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
