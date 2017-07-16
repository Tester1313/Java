import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Leia 3 valores e apresenta eles em ordem descrescente
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1° valor: ");
		int valor1  = scan.nextInt();
		
		System.out.println("Digite a 2° valor: ");
		int valor2  = scan.nextInt();
		
		System.out.println("Digite a 3° valor: ");
		int valor3  = scan.nextInt();
		
		
		int maior = 0;
		int meio = 0;
		int menor=0;
		// Pegao o Maior valor
		if ( valor1 > valor2 && valor1 > valor3 ) {
			//System.out.println("Valor1 é o maior dos três");
			maior = valor1;
		} else if ( valor2 > valor1 && valor2 > valor3) {
			//System.out.println("Valor2 é o maior dos três ");
			maior = valor2;
		} else {
			//System.out.println("Valor3 é o maior dos três ");
			maior = valor3;
		}
		
		// Pega o menor valor
		if ( valor1 < valor2 && valor1 < valor3 ) {
			//System.out.println("Valor1 é o menor dos três voce deve comprar ele ");
			menor = valor1;
		} else if ( valor2 < valor1 && valor2 < valor3) {
			//System.out.println("Valor2 é o menor dos três voce deve comprar ele");
			menor = valor2;
		} else {
			//System.out.println("Valor3 é o menor dos três voce deve comprar ele");
			menor = valor3;
		}
		
		// Pega o menor valor
		if ( valor1 < valor2 && valor1 > valor3 ) {
			//System.out.println("Valor1 é o menor dos três voce deve comprar ele ");
			meio = valor1;
		} else if (valor1 > valor2 && valor1 < valor3 ) {
			//System.out.println("Valor2 é o menor dos três voce deve comprar ele");
			meio = valor1;
		} else if ( valor1 > valor3 && valor1 < valor2) {
			meio = valor1;
		}  else if ( valor1 < valor3 && valor1 > valor2) {
			meio = valor1;
		} else if (  valor2 < valor1 && valor2 > valor3 ){
			//System.out.println("Valor3 é o menor dos três voce deve comprar ele");
			meio = valor2;
		} else if (  valor2 > valor1 && valor2 < valor3) {
			meio = valor2;
		} else if ( valor2 > valor3 && valor2 < valor1 ) {
			meio = valor2;
		} else if ( valor2 < valor3 && valor1 > valor2) {
			meio = valor2;
		} else {
			meio = valor3;
		}
			System.out.println("Número em ordem descrescente: "+ maior +" "+ meio +" "+menor);
	}

}
