package br.com.dinheiro;

public class RetirarDinheiro {
	
	//Criando o metodo banco que vai retornar uma variavel do tipo int
	public void banco(int dinheiro) {
		
		//Criando as variaveis que irão fazer a contagem do dinheiro que vai sair no tipo int
		int nota200 = 0, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
		
		//Um laço para caso o dinheiro seja diferente de 0
		while(dinheiro != 0) {
			
			//Se o dinheiro receber o valor igual ou maior que 200 então ele irá retirar uma nota ou mais de 200
			// até que não possa mais, em seguida irá pular para o outro laço
			while(dinheiro >= 200) {
				dinheiro = dinheiro - 200;
				nota200 = nota200 + 1;
			}
			
			//Caso o valor seja menor que 200 e maior que 100 ainda, então ele irá retirar uma nota de 100
			// até que não tenha mais como e irá pular para o laço seguinte
			while(dinheiro >= 100) {
				dinheiro = dinheiro - 100;
				nota100 = nota100 + 1;
			}
			
			while(dinheiro >= 50) {
				dinheiro = dinheiro - 50;
				nota50 = nota50 + 1;
			}
			
			while(dinheiro >= 20) {
				dinheiro = dinheiro - 20;
				nota20 = nota20 + 1;
			}
			
			while(dinheiro >= 10) {
				dinheiro = dinheiro - 10;
				nota10 = nota10 + 1;
			}
			
			while(dinheiro >= 5) {
				dinheiro = dinheiro - 5;
				nota5 = nota5 + 1;
			}
			
			while(dinheiro >= 2) {
				dinheiro = dinheiro - 2;
				nota2 = nota2 + 1;
			}
			
			while(dinheiro >= 1) {
				dinheiro = dinheiro - 1;
				nota1 = nota1 + 1;
			}
			
			//Aqui temos a condição de exibir apenas as notas que forem retiradas, caso a nota não seja retirada
			// não irá ser exibida no console
			if(nota200 >= 1) {
			System.out.println(nota200 + " notas de 200 reais");
			}
			
			if(nota100 >= 1) {
			System.out.println(nota100 + " notas de 100 reais");
			}
			
			if(nota50 >= 1) {
			System.out.println(nota50 + " notas de 50 reais");
			}
			
			if(nota20 >= 1) {
			System.out.println(nota20 + " notas de 20 reais");
			}
			
			if(nota10 >= 1) {
			System.out.println(nota10 + " notas de 10 reais");
			}
			
			if(nota5 >= 1) {
			System.out.println(nota5 + " notas de 5 reais");
			}
			
			if(nota2 >= 1) {
			System.out.println(nota2 + " notas de 2 reais");
			}
			
			if(nota1 >= 1) {
				System.out.println(nota1 + " notas de 1 real");
			}
		}
	}
}