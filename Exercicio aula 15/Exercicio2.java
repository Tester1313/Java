import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Mostra se o valor é positivo ou negativo
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = scan.nextInt();
		
		if ( valor > 0) {
			System.out.println("O valor é positivo.");
		}else if( valor < 0 ) {
			System.out.println("O valor é negativo");
		}else {
			System.out.println("O valor é Zero.");
		}
	}

}
