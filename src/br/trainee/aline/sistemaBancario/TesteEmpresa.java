package br.trainee.aline.sistemaBancario;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria a empresa empresa
		Empresa empresa = new Empresa();
		// Array com 10 posi��es para funcionarios
		empresa.funcinarios = new Funcionario[10];

		// Cria funcion�rio f1
		Funcionario f1 = new Funcionario();

		f1.salario = 1000.0;
		//System.out.println("Salario: " + f1.salario);

		// Adiciona funcion�rio f1
		empresa.adiciona(f1);

		// Cria funcion�rio f2
		Funcionario f2 = new Funcionario();

		f2.salario = 2000;
		//System.out.println("Salario: " + f2.salario);
		// Adiciona funcion�rio f2
		empresa.adiciona(f2);

		// criaa funcion�rios dentro de um loop e da a cada um deles valores
		// diferentes de sal�rios
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
			System.out.println("Sal�rio: " + f.salario);

		}

	}

}
