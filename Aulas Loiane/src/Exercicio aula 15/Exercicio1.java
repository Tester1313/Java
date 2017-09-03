import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Comparar dois valores
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		int primeiro = scan.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		int segundo = scan.nextInt();
		
		if ( primeiro > segundo ) {
			System.out.println("O 1° valor é maior que o 2° valor.");
		}else if( segundo > primeiro ) {
			System.out.println("O 2° valor é maior que o 1° valor.");
		}else {
			System.out.println("os valores são iguais");
		}
	}

}
