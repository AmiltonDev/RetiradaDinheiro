package br.com.dinheiro;

//Importa��o do pacote java.util.Scanner
import java.util.Scanner;

public class Exec {
	
	//Tornando privado o Scanner com o nome teclado
	private static Scanner teclado;
	
	public static void main(String[]args) {
		
		//Chamando o objeto Scanner nomeado de teclado e criando ele dentro da execu��o
		teclado = new Scanner(System.in);
		
		//Ser� impresso no console perguntando quanto o usu�rio deseja retirar no caixa
		System.out.print("Qual o valor que deseja retirar?");
		
		//Aqui a variavel n do tipo int j� vai estar recebendo do usu�rio o valor que ele digitar em inteiro
		int n = teclado.nextInt();
		
		//Apenas para dar um espa�o antes de exibir os valores
		System.out.print("");
	
		//Chamando a classe RetirarDinheiro e atribuindo a ela um nome
		RetirarDinheiro banco = new RetirarDinheiro();
		
		//Buscando na classe com o nome de banco, o metodo banco onde est� o c�digo e atribuindo dentro dele
		// o valor que o usu�rio desejar
		banco.banco(n);
	}
}