package br.trainee.aline.sistemaBancario;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Produto {

	// Lista de produtos
	private List<Produto> produtos = new LinkedList<Produto>();

	int codigo;
	String descricao;
	double preco;

	//Construtor
	void Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Método para inserir produto
	void insere(Produto produto) {
		this.produtos.add(produto);
		System.out.println("Produto: " + produtos);
		System.out.println("Produtos adicionados com sucesso");
	}

	// Método para remover produto
	void remove(Produto produto) {
		this.produtos.remove(produto);
		System.out.println("Produto: " + produtos);
		System.out.println("Produtos removidos com sucesso");
	}

	// Método para verificar se há produto
	boolean vazio() {
		return this.produtos.size() == 0;
	}

	// Saída
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

	/*
	 * void inserir(int codigo, String descricao, double preco) { this.codigo =
	 * codigo; this.descricao = descricao; this.preco = preco;
	 * 
	 * System.out.println("Código: " + this.codigo); System.out.println(
	 * "Descrição: " + this.descricao); System.out.println("Preço: " +
	 * this.preco);
	 * 
	 * System.out.println("Produtos cadastrados com sucesso");
	 * 
	 * 
	 * }
	 * 
	 * void remover(int codigo, String descricao, double preco) {
	 * this.setCodigo(0); this.setDescricao(null); this.setPreco(0);
	 * 
	 * System.out.println("Código: " + this.codigo); System.out.println(
	 * "Descrição: " + this.descricao); System.out.println("Preço: " +
	 * this.preco);
	 * 
	 * System.out.println("Produtos removidos com sucesso"); }
	 * 
	 * void alterar(int codigo, String descricao, double preco) {
	 * this.getCodigo(); this.getDescricao(); this.getPreco();
	 * 
	 * System.out.println("Código: " + this.codigo); System.out.println(
	 * "Descrição: " + this.descricao); System.out.println("Preço: " +
	 * this.preco);
	 * 
	 * System.out.println("Produtos alterados com sucesso");
	 * 
	 * 
	 * }
	 * 
	 * void mostrarProdutos() { System.out.println("Código: " + this.codigo);
	 * System.out.println("Descrição: " + this.descricao); System.out.println(
	 * "Preço: " + this.preco); }
	 */

	/*
	 * void recebeAumentoPercentual() { int taxaAumento; double valorProduto;
	 * 
	 * System.out.print("Digite o valor do produto: "); Scanner scanner = new
	 * Scanner(System.in); valorProduto = scanner.nextInt();
	 * 
	 * System.out.print("Digite o código do valor do produto: "); Scanner
	 * scanner1 = new Scanner(System.in); taxaAumento = scanner1.nextInt();
	 * 
	 * switch (taxaAumento) { case 1: valorProduto = valorProduto +
	 * (valorProduto * 10 / 100); System.out.println("R$: " + valorProduto);
	 * break;
	 * 
	 * case 3: valorProduto = valorProduto + (valorProduto * 25 / 100);
	 * System.out.println("R$: " + valorProduto); break;
	 * 
	 * case 4: valorProduto = valorProduto + (valorProduto * 30 / 100);
	 * System.out.println("R$: " + valorProduto); break;
	 * 
	 * case 8: valorProduto = valorProduto + (valorProduto * 50 / 100);
	 * System.out.println("R$: " + valorProduto);
	 * 
	 * }
	 */

}
