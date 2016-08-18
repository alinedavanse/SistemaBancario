package br.trainee.aline.sistemaBancario;

public class PessoaFisica {

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	//M�todo que verifica se o CPF � v�lido
	public void setCpf(String cpf) {
		if (!valida(cpf)) {
			this.cpf = "0";
			System.out.println("O CPF � inv�lido");
		} else {
			this.cpf = cpf;
			System.out.println("O CPF � v�lido");
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

	//M�todo que valida o CPF
	private boolean valida(String cpf) {
		if (cpf == "123.654.234-12") {
			return true;
		} else {
			return false;
		}

	}

	//M�todo que exibe o nome e CPF
	public void mostraDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
	}

}
