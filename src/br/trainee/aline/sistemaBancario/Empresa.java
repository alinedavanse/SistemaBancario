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

	// M�todo que verifica se o funcion�rio trabalha na empresa
	boolean contem(Funcionario f) {
		if (f == null) {
			return false;
		}
		for (int i = 0; i <= this.funcinarios.length; i++) {
			if (this.funcinarios[i] != null) {
				if ((f.nome == (this.funcinarios[i].nome)) && (f.departamento == (this.funcinarios[i].departamento))
						&& (f.salario == this.funcinarios[i].salario)) {
					System.out.println("Funcionario " + f.nome + " j� trabalha nesta empresa");
					return true;
				}
			} else {
				System.out.println("O Funcion�rio " + f.nome + " n�o trabalha conosco");
				return false;
			}
		}
		System.out.println("O Funcion�rio " + f.nome + " n�o trabalha conosco");
		return false;
	}

	// M�todo que adiciona funcion�rio
	void adiciona(Funcionario f) {

		if (cont > 10) {
			System.out.println("Cheio");
		} else {
			this.funcinarios[cont] = f;
			this.cont++;
		}

		// System.out.println("Cont: " +cont);

	}

	// M�todo que exibe os funcion�rios cadastrados nas posi��es do vetor
	void mostraFuncionarios() {
		for (int i = 0; i < this.funcinarios.length; i++) {
			System.out.println("Funcionario na posi��o: " + i);
		}
	}

	// M�todo que exibe os funcion�rios com seu nome, departamento e sal�rio
	// cadastrados nas posi��es do vetor
	void mostra() {
		System.out.println("\n-------FUNCION�RIOS CADASTRADOS--------");
		for (int i = 0; i < this.funcinarios.length; i++) {
			if (funcinarios[i] != null) {
				System.out.println("\nFuncion�rio na posi��o: " + i);
				System.out.println("\nNome: " + funcinarios[i].nome + "\nDepartamento: " + funcinarios[i].departamento
						+ "\nSal�rio: " + funcinarios[i].salario);
			} else {
				break;
			}
		}
	}

}
