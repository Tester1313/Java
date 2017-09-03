import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// Calcula fatorial
		int valor;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor ara calculo fatorial: ");
		valor = scan.nextInt();
		
		for(int i = valor; i > 1; i--) {
			valor = valor * (i-1);
			System.out.print(i + " . ");
		}
		System.out.println("51 ="+valor);
	


	}

}
