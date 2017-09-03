package aula18;

import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {
		// Break e Continue
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for( int i = num; i <= max ; i++) {
			
			if(i % 7 ==0) {
				System.out.println("O valor de i é: "+i);
				break;
			}
		}*/
		
		// ROTULO mais utilizado em liguagens de baixo nivel com Assembly
		/*for ( int i = 0 ; i <= 4; i++) {
			rotulo1: {
				rotulo2:{
					rotulo3:{
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if( i== 3 ) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
				System.out.println("rotulo2");
				}
			System.out.println("rotulo1");
			}
		System.out.println("Valor de i: "+i);
		}*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for( int i = num; i <= max ; i++) {
			
			if(i % 7 ==0) {
				continue; // Pula a iteração em questao
			}
			System.out.println("O valor de i é: "+i);
		}
	}

}
