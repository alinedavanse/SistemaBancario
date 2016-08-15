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

		System.out.println("-----------------------ARRAY SEM CONSTRUTOR-------------------------------");

		int[] produtos;
		String[] descricao;
		double[] preco;

		produtos = new int[5];
		descricao = new String[5];
		preco = new double[5];

		produtos[0] = 20;
		produtos[1] = 2;
		produtos[2] = 89;
		produtos[3] = 54;
		produtos[4] = 22;

		descricao[0] = "Computador";
		descricao[1] = "Celular";
		descricao[2] = "Notebook";
		descricao[3] = "HD externo";
		descricao[4] = "Mesa";

		preco[0] = 5500;
		preco[1] = 4500;
		preco[2] = 6000;
		preco[3] = 300;
		preco[4] = 1500;

		System.out.println("Produto: " + produtos[0]);
		System.out.println("Descrição: " + descricao[0]);
		System.out.println("Preço: " + preco[0]);
		System.out.println("Produto: " + produtos[1]);
		System.out.println("Descrição: " + descricao[1]);
		System.out.println("Preço: " + preco[1]);
		System.out.println("Produto: " + produtos[2]);
		System.out.println("Descrição: " + descricao[2]);
		System.out.println("Preço: " + preco[2]);
		System.out.println("Produto: " + produtos[3]);
		System.out.println("Descrição: " + descricao[3]);
		System.out.println("Preço: " + preco[3]);
		System.out.println("Produto: " + produtos[4]);
		System.out.println("Descrição: " + descricao[4]);
		System.out.println("Preço: " + preco[4]);

		System.out.println("-----------------------ARRAY COM CONSTRUTOR-------------------------------");

		int[] produtos1 = { 20, 2, 89, 54, 22 };
		String[] descricao1 = { "Computador", "Celular", "Notebook", "HD externo", "Mesa" };
		double[] preco1 = { 5500, 4500, 6000, 300, 1500 };

		for (int i = 0; i < produtos1.length; i++) {
			for (int x = 0; x < descricao1.length; x++) {
				for (int y = 0; y < preco1.length; y++) {
					System.out.println("Produtos: " + produtos1[y]);
					System.out.println("Descrição: " + descricao1[y]);
					System.out.println("Preço: " + preco1[y]);

				}
				break;
			}

			break;
		}

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
