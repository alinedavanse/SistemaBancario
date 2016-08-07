package br.trainee.aline.sistemaBancario;

public class TesteProduto {

	public static void main(String[] args) {

		// Criando Produto produto
		Produto produto = new Produto();
		produto.codigo = 1111;
		produto.descricao = "Computador";
		produto.preco = 5000;

		// Criando Produto produto2
		Produto produto2 = new Produto();
		produto2.codigo = 2222;
		produto2.descricao = "Celular";
		produto2.preco = 4500;

		if (!produto.vazio()) {
			System.out.println("Erro: O produto não está vazio");
		}

		// Adicionar produto
		produto.insere(produto);
		produto2.insere(produto2);

		// Remover produto
		produto.remove(produto);

		// Verifica se há produto
		produto.vazio();

	}

}

// System.out.println("-------PRODUTOS CADASTRADOS-------");
// p1.inserir(1, "computador", 5000);

// System.out.println("-------PRODUTOS REMOVIDOS-------");
// p1.remover(1, "computador", 5000);

// System.out.println("-------PRODUTOS ALTERADOS-------");
// p1.alterar(2, "PC", 4000);
// Descrevendo produto p1
// p1.descricao = "Computador";
// p1.preco = 5000;

// Recebe aumento
// p1.recebeAumentoPercentual();

// Cadastra produto p1

// Exibe produto p1 cadastrado
// p1.mostrarProdutos();

// p1.excluirProduto(p1);
