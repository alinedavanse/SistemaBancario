package br.trainee.aline.sistemaBancario;

public class PessoaFisica {

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	//Método que verifica se o CPF é válido
	public void setCpf(String cpf) {
		if (!valida(cpf)) {
			this.cpf = "0";
			System.out.println("O CPF é inválido");
		} else {
			this.cpf = cpf;
			System.out.println("O CPF é válido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Inicia o cadastro
	PessoaFisica() {
		System.out.println("Cadastro iniciando!");
	}

	//Construtor que recebe nome e cpf
	PessoaFisica(String nome, String cpf) {
		this();
		setNome(nome);
		setCpf(cpf);

	}

	//Método que valida o CPF
	private boolean valida(String cpf) {
		if (cpf == "123.654.234-12") {
			return true;
		} else {
			return false;
		}

	}

	//Método que exibe o nome e CPF
	public void mostraDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
	}

}
