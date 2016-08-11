package br.trainee.aline.sistemaBancario;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria a empresa empresa
		Empresa empresa = new Empresa();
		// Array com 10 posições para funcionarios
		empresa.funcinarios = new Funcionario[10];

		// Funcionários cadastrados na empresa(Nome, departamento e salário)
		String[] nome = { "Aline", "Larissa", "Vanessa", "Monica", "Ricardo" };
		String[] departamento = { "Desenvolvedora", "DBA", "Marketing", "Recursos Humanos", "Suporte" };
		double[] salario = { 5000, 8000, 3000, 4500, 2000 };

		// Cria funcionário contendo nome, departamento, salário e adiciona nas
		// posições
		for (int i = 0; i < nome.length; i++) {
			Funcionario f = new Funcionario(nome[i], departamento[i], salario[i]);
			empresa.adiciona(f);
		}

		// Cria o funcionário f3
		Funcionario f3 = new Funcionario("Pitty", "Administradora", 3000);
		// Cria funcionário f4
		Funcionario f4 = new Funcionario("Raquel", "Contadora", 4000);

		// Funcionários que já trabalham na empresa dos cadastrados
		empresa.contem(empresa.funcinarios[2]);
		empresa.contem(empresa.funcinarios[0]);

		// Verifica se contem funcionário
		empresa.contem(f3);
		empresa.contem(f4);
		// Exibe
		empresa.mostra();

		/*
		 * // Cria funcionário f1 Funcionario f1 = new Funcionario();
		 * 
		 * f1.salario = 1000.0; System.out.println("Salário: " + f1.salario); //
		 * Adiciona funcionário f1 empresa.adiciona(f1);
		 * 
		 * // Cria funcionário f2 Funcionario f2 = new Funcionario();
		 * 
		 * f2.salario = 2000; System.out.println("Salário: " + f2.salario); //
		 * Adiciona funcionário f2 empresa.adiciona(f2);
		 * 
		 * Funcionario f3 = new Funcionario();
		 * 
		 * f3.salario = 3000; System.out.println("Salário: " + f3.salario);
		 * empresa.adiciona(f3);
		 * 
		 * Funcionario f4 = new Funcionario();
		 * 
		 * f4.salario = 4000; System.out.println("Salário: " + f4.salario);
		 * empresa.adiciona(f4);
		 * 
		 * Funcionario f5 = new Funcionario();
		 * 
		 * f5.salario = 5000; System.out.println("Salário: " + f5.salario);
		 * empresa.adiciona(f5);
		 * 
		 * Funcionario f6 = new Funcionario();
		 * 
		 * f6.salario = 6000; System.out.println("Salário: " + f6.salario);
		 * empresa.adiciona(f6);
		 * 
		 * Funcionario f7 = new Funcionario();
		 * 
		 * f7.salario = 7000; System.out.println("Salário: " + f7.salario);
		 * empresa.adiciona(f7);
		 * 
		 * Funcionario f8 = new Funcionario();
		 * 
		 * f8.salario = 8000; System.out.println("Salário: " + f8.salario);
		 * empresa.adiciona(f8);
		 * 
		 * Funcionario f9 = new Funcionario();
		 * 
		 * f9.salario = 9000; System.out.println("Salário: " + f9.salario);
		 * empresa.adiciona(f9);
		 * 
		 * Funcionario f10 = new Funcionario();
		 * 
		 * f10.salario = 10000; System.out.println("Salário: " + f10.salario);
		 * empresa.adiciona(f10);
		 * 
		 * // Mostra em que posição cada funcionário está
		 * empresa.mostraFuncionarios();
		 * 
		 * // criaa funcionários dentro de um loop e da a cada um deles valores
		 * // diferentes de salários /* for (int i = 0; i < 5; i++) {
		 * Funcionario f = new Funcionario(); f.salario = 1000 + i * 100;
		 * empresa.adiciona(f); System.out.println( "Salário: " + f.salario);
		 * 
		 * }
		 */

	}

}
