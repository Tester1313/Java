import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Pe�a nota de 0 a 10, sen�o for v�lida pe�a novamente
		Scanner scan = new Scanner(System.in);
		double nota = 0;
				
		do {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota= scan.nextDouble();
		}while ( nota > 10 || nota < 0);
				

	}

}
