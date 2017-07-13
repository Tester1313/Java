package com.thiago.cursojava.aula12;
import java.util.Scanner; // importa classe scanner

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Importa classe scanner
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto= scan.nextLine(); // Le
		System.out.println("Seu nome completo: "+nomeCompleto); // Imprime
		
		// Leitura de dado especifico
		System.out.println("Digite seu primeiro completo: ");
		String primeiroNome= scan.next(); // Pega somente o 1 nome
		System.out.println("Seu primeiro nome é: "+ primeiroNome); */
		
		/*System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: "+ idade; */
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);
	}

}
