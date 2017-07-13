package com.thiago.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2 ;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado  * 3;
		System.out.println(resultado);
		
		resultado = resultado / 3;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7 ;
		System.out.println(resultado);
		
		String  primeiroNome = "Esta é";
		String  segundoNome = " uma String concatenada.";
		String  terceiroNome = primeiroNome + segundoNome; // existem maneiras melhores de fazer isso
		System.out.println(terceiroNome);
		
		
		resultado++;  // incrementa 1
		System.out.println(resultado + " Teste");
		System.out.println(resultado++); // Primeiro imprimi e depois soma
		System.out.println(++resultado); // Soma primeiro e depois imprimi
	}

}
