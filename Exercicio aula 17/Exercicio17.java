import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Calcula o fatorial
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		for(int i = valor; i > 1; i--) {
			valor = valor * (i-1);
		}
		System.out.println("Resultado do fatorial é: "+valor);
	}

}
