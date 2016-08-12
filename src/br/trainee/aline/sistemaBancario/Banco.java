package br.trainee.aline.sistemaBancario;

public class Banco {

	String nome;
	String cnpj;
	Empregados[] empregados;
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
	boolean contem(Empregados e) {
		if (e == null) {
			return false;
		}
		for (int i = 0; i <= this.empregados.length; i++) {
			if (this.empregados[i] != null) {
				if ((e.nome == (this.empregados[i].nome)) && (e.departamento.equals(this.empregados[i].departamento))
						&& (e.salario == this.empregados[i].salario)) {
					System.out.println("Empregado " + e.nome + " já trabalha nesta empresa");
					return true;
				}
			} else {
				System.out.println("O empregado " + e.nome + " não trabalha conosco");
				return false;
			}
		}
		System.out.println("O empregado " + e.nome + " não trabalha conosco");
		return false;
	}

	// Método que adiciona empregados
	void adiciona(Empregados e) {
		if (cont > 10) {
			System.out.print("Cheio");
		} else {
			this.empregados[cont] = e;
			cont = cont + 1;
		}

	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionários nas posições: " + i);

		}
	}

	void mostra() {
		System.out.println("-----EMPREGADOS CADASTRADOS-----");
		for (int i = 0; i < this.empregados.length; i++) {
			if (empregados[i] != null) {
				System.out.println("Empregados nas posições: " + i);
				System.out.println("\nNome: " + empregados[i].nome + "\nDepartamento: " + empregados[i].departamento
						+ "\nSalário: " + empregados[i].salario);
			} else {
				break;
			}
		}
	}
}
