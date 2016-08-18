package br.trainee.aline.sistemaBancario;

public class PessoaFisicaTeste {

	public static void main(String[] args) {

		// Cria PessoaFisica p1
		PessoaFisica p1 = new PessoaFisica();
		// Cria PessoaFisica p2
		PessoaFisica p2 = new PessoaFisica();

		// Cadastra nome e cpf de p1
		System.out.println("---------------------");
		p1.setNome("Aline");
		p1.setCpf("123.654.234-12");
		p1.mostraDados();

		// Cadastra nome e cpf de p2
		System.out.println("---------------------");
		p2.setNome("Leila");
		p2.setCpf("646.234.154-23");
		p2.mostraDados();

	}

}
