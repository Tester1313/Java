import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faz calculo exponencial
		
		int resultado = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		
		for( int i = 1; i <= valor2; i++ ) {
			if( valor2 != 0) {
				resultado = valor1 * resultado;
			}
		}
		
		System.out.println("Resultado = "+resultado);
	}

}
