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

	// Método que verifica se o funcionário trabalha na empresa
	boolean contem(Funcionario f) {
		if (f == null) {
			return false;
		}
		for (int i = 0; i <= this.funcinarios.length; i++) {
			if (this.funcinarios[i] != null) {
				if ((f.nome == (this.funcinarios[i].nome)) && (f.departamento == (this.funcinarios[i].departamento))
						&& (f.salario == this.funcinarios[i].salario)) {
					System.out.println("Funcionario " + f.nome + " já trabalha nesta empresa");
					return true;
				}
			} else {
				System.out.println("O Funcionário " + f.nome + " não trabalha conosco");
				return false;
			}
		}
		System.out.println("O Funcionário " + f.nome + " não trabalha conosco");
		return false;
	}

	// Método que adiciona funcionário
	void adiciona(Funcionario f) {

		if (cont > 10) {
			System.out.println("Cheio");
		} else {
			this.funcinarios[cont] = f;
			this.cont++;
		}

		// System.out.println("Cont: " +cont);

	}

	// Método que exibe os funcionários cadastrados nas posições do vetor
	void mostraFuncionarios() {
		for (int i = 0; i < this.funcinarios.length; i++) {
			System.out.println("Funcionario na posição: " + i);
		}
	}

	// Método que exibe os funcionários com seu nome, departamento e salário
	// cadastrados nas posições do vetor
	void mostra() {
		System.out.println("\n-------FUNCIONÁRIOS CADASTRADOS--------");
		for (int i = 0; i < this.funcinarios.length; i++) {
			if (funcinarios[i] != null) {
				System.out.println("\nFuncionário na posição: " + i);
				System.out.println("\nNome: " + funcinarios[i].nome + "\nDepartamento: " + funcinarios[i].departamento
						+ "\nSalário: " + funcinarios[i].salario);
			} else {
				break;
			}
		}
	}

}
