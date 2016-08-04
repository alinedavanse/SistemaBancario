package br.trainee.aline.sistemaBancario;

import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Tela {

	public static void main(String[] args) {

		int menu = 0;

		Cliente novoCliente = new Cliente();

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					" Sistema Bancário  \n\n" 
			        + "\n\nQual item deseja escolher? " 
					+ "\n\n1 - Cadastrar cliente "
					+ "\n 2 - Exibir cliente " 
					+ "\n 3 - Imprimir Cliente  " 
					+ "\n 4 - Sair"));

			if (menu == 1) {

				try {

					String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
					String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome: ");
					String cpf = JOptionPane.showInputDialog(null, "Digite o CPF: ");

					novoCliente.cadastrarCliente(nome, sobrenome, cpf);

				} catch (Exception e) {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Um dos dados está incorreto!", "Cadastro De Clientes!",
							JOptionPane.ERROR_MESSAGE);
				}

			} else if (menu == 2) {
				// chamando o metodo mostrar Produtos
				JOptionPane.showMessageDialog(null,
						"Lista do(s) clientes(s) cadastrado(s): " + novoCliente.mostrarClientes(),
						" Cadastro De Clientes: ", JOptionPane.INFORMATION_MESSAGE);
			}

		} while (menu != 0);
		System.exit(0);

	}

}
