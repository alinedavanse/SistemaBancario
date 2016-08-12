package br.trainee.aline.sistemaBancario;

public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria banco banco
		Banco banco = new Banco();
		banco.empregados = new Empregados[10];

		String[] nome = { "Aline", "Pedro", "Maria", "Larissa", "Tamires"};
		String[] departamento = { "Desenvolvedora Java", "RH", "DBA", "Suporte", "Marketing"};
		double[] salario = { 5000, 3500, 2540, 8000, 1500};

		for (int i = 0; i < nome.length; i++) {
			Empregados e = new Empregados(nome[i], departamento[i], salario[i]);
			banco.adiciona(e);
		}

		Empregados e1 = new Empregados("Vanessa", "Recepcionista", 1000);
		Empregados e2 = new Empregados("João", "Engenheiro Civil", 4000);

		banco.contem(banco.empregados[2]);
		banco.contem(banco.empregados[4]);

		banco.contem(e1);
		banco.contem(e2);

		banco.mostra();
		
		// Mostra os funcionários em cada posição do array
		//banco.mostraEmpregados();

	}

}
