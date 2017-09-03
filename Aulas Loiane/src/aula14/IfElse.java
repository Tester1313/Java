package aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade.");
		}else {
			System.out.println("É menor de idade");
		}*/
		
		// Exemplo Multiplos If e Else
		
		// barato <=10 reais
		// 10  valor < 15 -> pedir desconto
		// 15 <= valor 17 - Pesquisar mais
		// >== 17 - muito caro
		
		System.out.print("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if( valor <= 10 ) {
			System.out.println("Está barato, pode comprar");
		}else if( valor > 10 && valor <15) {
			System.out.println("Pedir desconto");
		}else if( valor >=15 && valor <17) {
			System.out.println("Pode pesquisar mais");
		}else {
			System.out.println("Valor está muito caro.");
		}
	}

}
