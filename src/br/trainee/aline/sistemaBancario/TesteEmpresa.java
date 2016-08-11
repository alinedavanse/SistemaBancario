package br.trainee.aline.sistemaBancario;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria a empresa empresa
		Empresa empresa = new Empresa();
		// Array com 10 posi��es para funcionarios
		empresa.funcinarios = new Funcionario[10];

		// Funcion�rios cadastrados na empresa(Nome, departamento e sal�rio)
		String[] nome = { "Aline", "Larissa", "Vanessa", "Monica", "Ricardo" };
		String[] departamento = { "Desenvolvedora", "DBA", "Marketing", "Recursos Humanos", "Suporte" };
		double[] salario = { 5000, 8000, 3000, 4500, 2000 };

		// Cria funcion�rio contendo nome, departamento, sal�rio e adiciona nas
		// posi��es
		for (int i = 0; i < nome.length; i++) {
			Funcionario f = new Funcionario(nome[i], departamento[i], salario[i]);
			empresa.adiciona(f);
		}

		// Cria o funcion�rio f3
		Funcionario f3 = new Funcionario("Pitty", "Administradora", 3000);
		// Cria funcion�rio f4
		Funcionario f4 = new Funcionario("Raquel", "Contadora", 4000);

		// Funcion�rios que j� trabalham na empresa dos cadastrados
		empresa.contem(empresa.funcinarios[2]);
		empresa.contem(empresa.funcinarios[0]);

		// Verifica se contem funcion�rio
		empresa.contem(f3);
		empresa.contem(f4);
		// Exibe
		empresa.mostra();

		/*
		 * // Cria funcion�rio f1 Funcionario f1 = new Funcionario();
		 * 
		 * f1.salario = 1000.0; System.out.println("Sal�rio: " + f1.salario); //
		 * Adiciona funcion�rio f1 empresa.adiciona(f1);
		 * 
		 * // Cria funcion�rio f2 Funcionario f2 = new Funcionario();
		 * 
		 * f2.salario = 2000; System.out.println("Sal�rio: " + f2.salario); //
		 * Adiciona funcion�rio f2 empresa.adiciona(f2);
		 * 
		 * Funcionario f3 = new Funcionario();
		 * 
		 * f3.salario = 3000; System.out.println("Sal�rio: " + f3.salario);
		 * empresa.adiciona(f3);
		 * 
		 * Funcionario f4 = new Funcionario();
		 * 
		 * f4.salario = 4000; System.out.println("Sal�rio: " + f4.salario);
		 * empresa.adiciona(f4);
		 * 
		 * Funcionario f5 = new Funcionario();
		 * 
		 * f5.salario = 5000; System.out.println("Sal�rio: " + f5.salario);
		 * empresa.adiciona(f5);
		 * 
		 * Funcionario f6 = new Funcionario();
		 * 
		 * f6.salario = 6000; System.out.println("Sal�rio: " + f6.salario);
		 * empresa.adiciona(f6);
		 * 
		 * Funcionario f7 = new Funcionario();
		 * 
		 * f7.salario = 7000; System.out.println("Sal�rio: " + f7.salario);
		 * empresa.adiciona(f7);
		 * 
		 * Funcionario f8 = new Funcionario();
		 * 
		 * f8.salario = 8000; System.out.println("Sal�rio: " + f8.salario);
		 * empresa.adiciona(f8);
		 * 
		 * Funcionario f9 = new Funcionario();
		 * 
		 * f9.salario = 9000; System.out.println("Sal�rio: " + f9.salario);
		 * empresa.adiciona(f9);
		 * 
		 * Funcionario f10 = new Funcionario();
		 * 
		 * f10.salario = 10000; System.out.println("Sal�rio: " + f10.salario);
		 * empresa.adiciona(f10);
		 * 
		 * // Mostra em que posi��o cada funcion�rio est�
		 * empresa.mostraFuncionarios();
		 * 
		 * // criaa funcion�rios dentro de um loop e da a cada um deles valores
		 * // diferentes de sal�rios /* for (int i = 0; i < 5; i++) {
		 * Funcionario f = new Funcionario(); f.salario = 1000 + i * 100;
		 * empresa.adiciona(f); System.out.println( "Sal�rio: " + f.salario);
		 * 
		 * }
		 */

	}

}
