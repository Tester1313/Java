import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Pede as entrada e conta quantos s�o pares e quantos s�o impares
		int valor;
		int par = 0;
		int impar = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			valor = scan.nextInt();
			
			if( (valor % 2) != 0) {
				impar++;
			} else {
				par++;
			}
		}
		System.out.println("Temos "+ par + " n�meros pares e "+ impar + " n�meros impares.");
	}

}
