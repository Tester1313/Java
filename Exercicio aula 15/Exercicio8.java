import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Le tres preco e informa para comprar o mais barato
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1° valor: ");
		double valor1  = scan.nextDouble();
		
		System.out.println("Digite a 2° valor: ");
		double valor2  = scan.nextDouble();
		
		System.out.println("Digite a 3° valor: ");
		double valor3  = scan.nextDouble();
		
		if ( valor1 < valor2 && valor1 < valor3 ) {
			System.out.println("Valor1 é o menor dos três voce deve comprar ele ");
		} else if ( valor2 < valor1 && valor2 < valor3) {
			System.out.println("Valor2 é o menor dos três voce deve comprar ele");
		} else {
			System.out.println("Valor3 é o menor dos três voce deve comprar ele");
		}

	}

}
