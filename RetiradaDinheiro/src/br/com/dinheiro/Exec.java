package br.com.dinheiro;

//Importação do pacote java.util.Scanner
import java.util.Scanner;

public class Exec {
	
	//Tornando privado o Scanner com o nome teclado
	private static Scanner teclado;
	
	public static void main(String[]args) {
		
		//Chamando o objeto Scanner nomeado de teclado e criando ele dentro da execução
		teclado = new Scanner(System.in);
		
		//Será impresso no console perguntando quanto o usuário deseja retirar no caixa
		System.out.print("Qual o valor que deseja retirar?");
		
		//Aqui a variavel n do tipo int já vai estar recebendo do usuário o valor que ele digitar em inteiro
		int n = teclado.nextInt();
		
		//Apenas para dar um espaço antes de exibir os valores
		System.out.print("");
	
		//Chamando a classe RetirarDinheiro e atribuindo a ela um nome
		RetirarDinheiro banco = new RetirarDinheiro();
		
		//Buscando na classe com o nome de banco, o metodo banco onde está o código e atribuindo dentro dele
		// o valor que o usuário desejar
		banco.banco(n);
	}
}