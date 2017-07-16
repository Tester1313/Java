import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Le 3 valores e verifica qual o maior

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1° valor: ");
		int valor1  = scan.nextInt();
		
		System.out.println("Digite a 2° valor: ");
		int valor2  = scan.nextInt();
		
		System.out.println("Digite a 3° valor: ");
		int valor3  = scan.nextInt();
		
		if ( valor1 > valor2 && valor1 > valor3 ) {
			System.out.println("Valor1 é o maior dos três ");
		} else if ( valor2 > valor1 && valor2 > valor3) {
			System.out.println("Valor2 é o maior dos três ");
		} else {
			System.out.println("Valor3 é o maior dos três ");
		}
	}

}
