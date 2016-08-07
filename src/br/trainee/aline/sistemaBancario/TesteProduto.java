package br.trainee.aline.sistemaBancario;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		
		
		System.out.println("-------PRODUTOS CADASTRADOS-------");
		p1.inserir(1, "computador", 5000);
		
		System.out.println("-------PRODUTOS REMOVIDOS-------");
		p1.remover(1, "computador", 5000);
		
		// Descrevendo produto p1
		// p1.descricao = "Computador";
		// p1.preco = 5000;

		// Recebe aumento
		// p1.recebeAumentoPercentual();

		// Cadastra produto p1

		// Exibe produto p1 cadastrado
		// p1.mostrarProdutos();

		// p1.excluirProduto(p1);

	}

}
